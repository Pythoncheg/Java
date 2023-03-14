package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public class Spearman extends Warrior {

    protected String name;

    public Spearman(String name, int x, int y, int flag){
        super(10, 1, 3, 5, 4, 4, x, y, flag);
        this.name = name;
    }




    @Override
    public String getInfo() {
        return String.format(" Я копейщик %s, Здоровье: %d, Скорость: %d, Координаты: Х: %d, Y: %d.",
                name, getHp(), getSpeed(), getCoordinats().x, getCoordinats().y);
    }


    @Override
    public void Step(ArrayList ally, ArrayList enemy) {

    }
}