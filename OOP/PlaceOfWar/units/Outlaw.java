package OOP.PlaceOfWar.units;

public class Outlaw extends Warrior {
    protected String name;

    public Outlaw (String name){
        super(10, 2, 10, 100);
        this.name = name;
    }



    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return
                "Я разбойник и зовут меня - "+name+
                        "\nМое здоровье: "+getHp()+
                        " HP.";

    }
}