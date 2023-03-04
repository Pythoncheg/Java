package OOP.PlaceOfWar.units;

public class Peasant extends BaseClass {
    protected String name;
    private int energy = 100;
    private int max_energy = 100;
    public Peasant(String name, int hp, int base_damag, int base_protection, int energy, int max_energy){
        super(100, 5, 5);
        this.name=name;
        this.energy=energy;
        this.max_energy=max_energy;
    }
    public Peasant(String name){
        super(100, 5, 5);
        this.name=name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Крестьянин и зовут меня - "+name+
                "\nМое здоровье: "+getHp()+
                " HP, у меня сейчас "+getClassAbilities()+" энергии.";
    }

    @Override
    public int getClassAbilities() {
        return energy;
    }
}