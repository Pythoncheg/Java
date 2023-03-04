package OOP.PlaceOfWar.units;

public abstract  class Archer extends BaseClass{
    private int bolts;
    private int max_bolts;


    public Archer(int hp, int base_damag, int base_protection, int bolts, int max_bolts) {
        super(hp, base_damag, base_protection);
        this.bolts=bolts;
        this.max_bolts=max_bolts;
    }
    @Override
    public int getClassAbilities() {
        return bolts;
    }
}
