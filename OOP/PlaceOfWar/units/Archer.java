package OOP.PlaceOfWar.units;

public abstract  class Archer extends BaseClass{
    private int shots;



    public Archer(int hp, int min_damage, int max_damage, int protection, int attack, int shots, int speed) {
        super(hp, min_damage, max_damage, protection, attack, speed);
        this.shots=shots;
    }

}
