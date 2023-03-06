package OOP.PlaceOfWar.units;

public class Spearman extends Warrior {

    protected String name;

    public Spearman(String name){
        super(10, 3, 5, 4);
        this.name = name;
    }



    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return
                "Я Копейщик и зовут меня - "+name+
                        "\nМое здоровье: "+getHp()+
                        " HP.";

    }

}