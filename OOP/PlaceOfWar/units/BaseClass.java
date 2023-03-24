package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public abstract class BaseClass implements GameInterface {
    protected String name;
    protected float hp;
    protected int maxHp;
    protected int min_damage;
    protected int max_damage;
    protected int attack;
    protected int protection;
    protected int speed;
    protected Vector2D coords;
    protected String status;
    protected static int heroCnt;

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + coords.posX +
                " A:" + coords.posY +
                " Dmg:" + Math.round(Math.abs((min_damage + max_damage) / 2)) +
                " " + status;
    }
    public int[] getCoords() {return new int[]{coords.posX, coords.posY};}
    protected BaseClass(String name, float hp, int maxHp, int min_damage, int max_damage, int protection, int attack, int speed, int posX, int posY) {
        this.name = name;
        this.hp = hp;
        this.min_damage = min_damage;
        this.max_damage = max_damage;
        this.protection = protection;
        this.attack = attack;
        this.speed = speed;
        this.coords = new Vector2D(posX, posY);
        this.maxHp = maxHp;
        status = "Stand";
        heroCnt++;




    }
    public float getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    protected void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            status = "Die";
        }
        if (hp > maxHp) hp = maxHp;
    }

    public int findNear(ArrayList<BaseClass> enemy){
        int index = 0;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < enemy.size(); i++) {
            if(min > coords.getDistance(enemy.get(i).coords) && !enemy.get(i).status.equals("Die")) {
                index = i;
                min = coords.getDistance(enemy.get(i).coords);
            }
        }
        return index;
    }

    @Override
    public void step(ArrayList<BaseClass> ally, ArrayList<BaseClass> enemy) {
    }

    public BaseClass findWounded(ArrayList<BaseClass> team) {
        int index = 0;
        double avgHp = Double.MAX_VALUE;
        for (int i = 0; i < team.size(); i++) {
            if (avgHp > team.get(i).maxHp - team.get(i).hp) {
                index = i;
                avgHp = team.get(i).maxHp - team.get(i).hp;
            }
        }
        return team.get(index);
    }
    public boolean getSupport(){
        return false;
    }

    @Override
    public StringBuilder getInfo() {
        return new StringBuilder("");
    }
}