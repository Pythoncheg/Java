package OOP.PlaceOfWar.units;

public class Spearman extends Warrior {

    protected String name;

    public Spearman(String name){
        super(10, 1, 3, 5, 4, 4);
        this.name = name;
    }



    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return String.format(" Я копейщик %s, Здоровье: %d, Скорость: %d", name, getHp(), getSpeed());
    }

}