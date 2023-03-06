package OOP.PlaceOfWar.units;

public class Crossbowman extends Archer {
    protected String name;

    public Crossbowman(String name){
        super(4, 3,3, 6, 16);
        this.name = name;
    }



    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return 
            "Я Арбалетчик и зовут меня - "+name+
            "\nМое здоровье: "+getHp()+" HP.";

    }
}
