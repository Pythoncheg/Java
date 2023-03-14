package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public class Outlaw extends Warrior {
    protected String name;

    public Outlaw (String name, int x, int y, int flag){
        super(10, 2, 4, 3, 8, 6, x, y, flag);
        this.name = name;
    }




    @Override
    public String getInfo() {
        return String.format(" Я разбойник %s, Здоровье: %d, Скорость: %d, Координаты: Х: %d, Y: %d.",
                name, getHp(), getSpeed(), getCoordinats().x, getCoordinats().y);

    }


}