package OOP.PlaceOfWar.units;

public abstract  class Archer extends BaseClass{
    private int shots;



    public Archer(int hp, int damage, int protection, int attack, int shots) {
        super(hp,damage, protection, attack);
        this.shots=shots;
    }

}
