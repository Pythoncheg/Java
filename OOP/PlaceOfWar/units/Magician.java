package OOP.PlaceOfWar.units;

public class Magician extends Manaman {

    protected String name;

    public Magician(String name){
        super(100, 12, 10, 100, 100);
        this.name = name;
    }



    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return
                "Я Маг и зовут меня - "+name+
                        "\nМое здоровье: "+getHp()+" HP, у меня сейчас "+getClassAbilities()+" маны.";

    }
}