package OOP.PlaceOfWar.units;

public class Outlaw extends Warrior {
    protected String name;

    public Outlaw (String name){
        super(10, 2, 4, 3, 8, 6);
        this.name = name;
    }



    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return String.format(" Я разбойник %s, Здоровье: %d, Скорость: %d", name, getHp(), getSpeed());

    }
}