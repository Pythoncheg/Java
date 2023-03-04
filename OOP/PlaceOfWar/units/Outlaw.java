package OOP.PlaceOfWar.units;

public class Outlaw extends Warrior {
    protected String name;

    public Outlaw (String name){
        super(100, 12, 10, 100, 100);
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
                        " HP, у меня сейчас "+getClassAbilities()+" ярости.";

    }
}