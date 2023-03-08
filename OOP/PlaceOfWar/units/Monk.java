package OOP.PlaceOfWar.units;

public class Monk extends Manaman {



    protected String name;

    public Monk(String name){
        super(30, -4, -4, 7, 12, 1, 5);
        this.name = name;
    }



    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return String.format(" Я маг %s, Здоровье: %d, Скорость: %d", name, getHp(), getSpeed());
    }
}