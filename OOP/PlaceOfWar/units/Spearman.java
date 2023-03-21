package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public class Spearman extends Warrior {

    protected String name;

    public Spearman(String name, int x, int y, int flag){
        super(10, 1, 3, 5, 4, 4, x, y, flag);
        this.name = name;
    }
    public String getName() {return name;}
    @Override
    public String getInfo() {
        return String.format(" Я копейщик %s, Здоровье: %d, Скорость: %d, Координаты: Х: %d, Y: %d.",
                name, getHp(), getSpeed(), getCoordinats().coordX, getCoordinats().coordY);
    }


    @Override
    public void step(ArrayList ally, ArrayList enemy) {

    }
}