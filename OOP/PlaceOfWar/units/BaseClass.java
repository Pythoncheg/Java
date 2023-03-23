package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public abstract class BaseClass implements GameInterface {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int min_damage;
    protected int max_damage;
    protected int attack;
    protected int protection;
    protected int speed;
    protected static Vector2D coords;
    protected String status;
    protected static int heroCnt;

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + protection +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((min_damage + max_damage) / 2)) +
                " " + status;
    }

    public BaseClass(String name, int hp, int min_damage, int max_damage, int protection, int attack, int speed, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.min_damage = min_damage;
        this.max_damage = max_damage;
        this.protection = protection;
        this.attack = attack;
        this.speed = speed;
        this.coords = new Vector2D(x, y);
        this.maxHp = hp;
        status = "Stand";
        heroCnt++;




    }
    public int getHp() {
        return this.hp;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int[] getCoordinats() {return new int[]{coords.coordX, coords.coordY};}


    protected void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            status = "Die";
        }
        if (hp > maxHp) hp = maxHp;
    }


    protected int findNear(ArrayList<BaseClass> list) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).status.equals("Die"));
            else if
            (min > coords.getDistance(list.get(i).coords)) {
                index = i;
                min = coords.getDistance(list.get(i).coords);
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