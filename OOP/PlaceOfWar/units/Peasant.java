package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public class Peasant extends BaseClass {
    protected String name;
    private int support = 1;

    public Peasant(String name, int x, int y, int flag){
        super(1, 1, 1, 1, 3, 3, x, y, flag);
        this.name=name;
    }



    @Override
    public String getInfo() {
        return String.format(" Я крестьянин %s, Здоровье: %d, Скорость: %d, Координаты: Х: %d, Y: %d.",
                name, getHp(), getSpeed(), getCoordinats().x, getCoordinats().y);
    }



    @Override
    public void Step(ArrayList ally, ArrayList enemy) {

    }
}