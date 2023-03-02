package OOP.PlaceOfWar.units;

public class Crossbowman extends Archer {
    public Crossbowman(String name){
        super(name, 100, 12, 10, 100, 100);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик и зовут меня - "+name;
    }
}
