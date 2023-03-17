package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public class Crossbowman extends Archer {
    protected String name;

    public Crossbowman(String name, int x, int y, int flag){
        super(4, 2,3, 3, 6, 16, 4, x, y, flag);
        this.name = name;
    }




    @Override
    public String getInfo() {
        return String.format(" Я арбалетчик %s, Здоровье: %d, Скорость: %d, Координаты: Х: %d, Y: %d.",
                name, getHp(), getSpeed(), getCoordinats().x, getCoordinats().y);
    }
    public String getName() {return name;}



}
