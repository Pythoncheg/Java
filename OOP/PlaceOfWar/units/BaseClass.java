package OOP.PlaceOfWar.units;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class BaseClass implements GameInterface {
    private int hp;
    private int damage;
    private int attack;
    private int protection;

    public BaseClass(int hp, int damage, int protection, int attack) {
        this.hp = hp;
        this.damage = damage;
        this.protection = protection;
        this.attack=attack;
    }

    protected int getHp() {
        return hp;
    }

    public void Attack() {

    }


}