package OOP.PlaceOfWar.units;

public class Peasant extends BaseClass {
    protected String name;
    private int support = 1;

    public Peasant(String name){
        super(1, 1, 1, 1, 3, 3);
        this.name=name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return String.format(" Я крестьянин %s, Здоровье: %d, Скорость: %d", name, getHp(), getSpeed());
    }

}