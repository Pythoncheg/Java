package OOP.PlaceOfWar.units;

public class Crossbowman extends Archer {
    protected String name;

    public Crossbowman(String name){
        super(4, 2,3, 3, 6, 16, 4);
        this.name = name;
    }



    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return String.format(" Я арбалетчик %s, Здоровье: %d, Скорость: %d", name, getHp(), getSpeed());
    }
}
