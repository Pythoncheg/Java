package OOP.PlaceOfWar.units;

public class Monk extends Manaman {



    protected String name;

    public Monk(String name){
        super(30, -4, 7, 12, 1);
        this.name = name;
    }



    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return
                "Я Маг и зовут меня - "+name+
                        "\nМое здоровье: "+getHp()+" HP.";

    }
}