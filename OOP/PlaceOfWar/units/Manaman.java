package OOP.PlaceOfWar.units;

public abstract class Manaman extends BaseClass{
    private int magic;

    public Manaman(int hp, int min_damage, int max_damage, int protection, int attack, int magic, int speed, int x, int y, int flag){
        super(hp, min_damage, max_damage, protection, attack, speed, x, y, flag);
        this.magic=magic;
    }

}
