package OOP.PlaceOfWar.units;

public abstract class Warrior extends BaseClass{
    private int rage;
    private int max_rage;

    public Warrior(int hp, int base_damag, int base_protection, int rage, int max_rage){
        super(hp, base_damag, base_protection);
        this.rage=rage;
        this.max_rage=max_rage;
    }

    @Override
    public int getClassAbilities() {
        return rage;
    }
}
