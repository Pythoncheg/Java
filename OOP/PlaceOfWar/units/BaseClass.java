package OOP.PlaceOfWar.units;

public abstract class BaseClass implements GameInterface {
    protected String name;
    protected int hp;
    protected int base_damag;
    protected int base_protection;

    public BaseClass(int hp, int base_damag, int base_protection, int i) {
        this.hp = hp;
        this.base_damag = base_damag;
        this.base_protection = base_protection;
    }

    public void GetNamePers(int id) {

    }

    public void Attack() {

    }

    public String Name() {
        return this.name.toString();
    }



}