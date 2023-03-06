package OOP.PlaceOfWar.units;

public abstract class Manaman extends BaseClass{
    private int magic;

    public Manaman(int hp, int damage, int protection, int attack, int magic){
        super(hp, damage, protection, attack);
        this.magic=magic;
    }

}
