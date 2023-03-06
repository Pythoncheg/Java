package OOP.PlaceOfWar.units;

public class Magician extends Manaman {

    protected String name;

    public Magician(String name){
        super(30, -5, 12, 17, 1);
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