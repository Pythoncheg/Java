package OOP.PlaceOfWar.units;

public abstract class BaseClass {
    protected String name;
    protected int hp;
    protected int id;
    protected int base_damag;
    protected int base_protection;

    public BaseClass(String name, int hp, int id, int base_damag, int base_protection) {
        this.name = name;
        this.hp = hp;
        this.id = id;
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