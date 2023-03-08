package OOP.PlaceOfWar.units;

public class Sniper extends Archer {
    protected String name;

    public Sniper(String name) {
        super(15, 8, 10, 10, 12, 32, 9);
        this.name = name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return String.format(" Я арболетчик %s, Здоровье: %d, Скорость: %d", name, getHp(), getSpeed());
    }
}