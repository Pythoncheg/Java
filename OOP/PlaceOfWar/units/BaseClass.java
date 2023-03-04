package OOP.PlaceOfWar.units;

public abstract class BaseClass implements GameInterface {
    private int hp;
    private int base_damag;
    private int base_protection;

    public BaseClass(int hp, int base_damag, int base_protection, int i) {
        this.hp = hp;
        this.base_damag = base_damag;
        this.base_protection = base_protection;
    }

    public void GetNamePers(int id) {

    }

    public void Attack() {

    }
}