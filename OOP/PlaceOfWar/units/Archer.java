package OOP.PlaceOfWar.units;

public abstract  class Archer extends BaseClass{
    protected int bolts;
    protected int max_bolts;


    public Archer(int hp, int base_damag, int base_protection, int bolts, int max_bolts) {
        super(hp, base_damag, base_protection, 10);
        this.bolts=bolts;
        this.max_bolts=max_bolts;
    }
}
