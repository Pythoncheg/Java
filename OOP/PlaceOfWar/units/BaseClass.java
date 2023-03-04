package OOP.PlaceOfWar.units;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class BaseClass implements GameInterface {
    private int hp;
    private int base_damag;
    private int base_protection;

    public BaseClass(int hp, int base_damag, int base_protection) {
        this.hp = hp;
        this.base_damag = base_damag;
        this.base_protection = base_protection;
    }

    protected int getHp() {
        return hp;
    }

    public void Attack() {

    }


}