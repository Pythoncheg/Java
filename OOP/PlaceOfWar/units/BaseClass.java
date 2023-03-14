package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public abstract class BaseClass implements GameInterface {
    private int hp;
    private int maxHp;
    protected int min_damage;
    protected int max_damage;
    protected int attack;
    protected int protection;
    private int speed;
    private Coordinats coordinats;
    protected int flag;
    protected String status;

    public BaseClass(int hp, int min_damage, int max_damage, int protection, int attack, int speed, int x, int y, int flag) {
        this.hp = hp;
        this.min_damage = min_damage;
        this.max_damage = max_damage;
        this.protection = protection;
        this.attack=attack;
        this.speed=speed;
        this.coordinats= new Coordinats(x, y);
        this.flag=flag;
        this.maxHp=hp;
        status = "Stand";


    }

    public int getHp() {
        return this.hp;
    }

    public int getSpeed() {return this.speed;}

    public Coordinats getCoordinats() {
        return coordinats;
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
    protected int findNear(ArrayList<BaseClass> list){
        double min = 100;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (min > coordinats.getDistance(list.get(i).coordinats)) {
                index = i;
                min = coordinats.getDistance(list.get(i).coordinats);
            }
        }
        return index;
    }
    @Override
    public void Step(ArrayList<BaseClass> ally, ArrayList<BaseClass> enemy){

    }
}