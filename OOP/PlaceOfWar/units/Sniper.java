package OOP.PlaceOfWar.units;

public class Sniper extends Archer {
    protected String name;

    public Sniper(String name) {
        super(100, 12, 10, 100, 100);
        this.name = name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик и зовут меня - " + name +
                "\nМое здоровье: " + hp + " HP, у меня сейчас " + bolts + " стрел.";
    }
}