package OOP.PlaceOfWar.units;

public class Peasant extends BaseClass {
    protected String name;
    private int support = 1;

    public Peasant(String name, int hp, int damage, int protection, int attack, int support){
        super(1, 1, 1, 1);
        this.name=name;
        this.support=support;

    }
    public Peasant(String name){
        super(1, 1, 1, 1);
        this.name=name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Крестьянин и зовут меня - "+name+
                "\nМое здоровье: "+getHp()+
                " HP.";
    }

}