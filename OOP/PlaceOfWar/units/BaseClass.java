package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public abstract class BaseClass implements GameInterface {
    protected int hp;
    protected int maxHp;
    protected int min_damage;
    protected int max_damage;
    protected int attack;
    protected int protection;
    private int speed;
    private static Vector2D vector2D;
    protected int flag;
    protected String status;

    public BaseClass(int hp, int min_damage, int max_damage, int protection, int attack, int speed, int x, int y, int flag) {
        this.hp = hp;
        this.min_damage = min_damage;
        this.max_damage = max_damage;
        this.protection = protection;
        this.attack = attack;
        this.speed = speed;
        this.vector2D = new Vector2D(x, y);
        this.flag = flag;
        this.maxHp = hp;
        status = "Stand";


    }
    public int getHp() {
        return this.hp;
    }

    public int getSpeed() {
        return this.speed;
    }

    public Vector2D getCoordinats() {
        return vector2D;
    }


    protected void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            status = "Die";
        }
        if (hp > maxHp) hp = maxHp;
    }

    public int getFlag() {
        return flag;
    }

    protected int findNear(ArrayList<BaseClass> list) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).status.equals("Die"));
            else if
            (min > vector2D.getDistance(list.get(i).vector2D)) {
                index = i;
                min = vector2D.getDistance(list.get(i).vector2D);
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
    };
}