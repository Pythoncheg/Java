package OOP.PlaceOfWar.units;

public abstract class Manaman extends BaseClass{
    private int mana;
    private int max_mana;
    public Manaman(int hp, int base_damag, int base_protection, int mana,int max_mana){
        super(hp, base_damag, base_protection);
        this.mana=mana;
        this.max_mana=max_mana;
    }

    @Override
    public int getClassAbilities() {
        return mana;
    }
}
