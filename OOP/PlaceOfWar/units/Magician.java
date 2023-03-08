package OOP.PlaceOfWar.units;

public class Magician extends Manaman {

    protected String name;

    public Magician(String name){
        super(30, -5, -5, 12, 17, 1, 9);
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