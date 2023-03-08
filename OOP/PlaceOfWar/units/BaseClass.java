package OOP.PlaceOfWar.units;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class BaseClass implements GameInterface {
    private int hp;
    private int min_damage;
    private int max_damage;
    private int attack;
    private int protection;
    private int speed;

    public BaseClass(int hp, int min_damage, int max_damage, int protection, int attack, int speed) {
        this.hp = hp;
        this.min_damage = min_damage;
        this.max_damage = max_damage;
        this.protection = protection;
        this.attack=attack;
        this.speed=speed;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {return speed;}

    public void Attack() {

    }


}