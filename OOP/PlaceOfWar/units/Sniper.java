package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public class Sniper extends Archer {
    protected String name;

    public Sniper(String name, int x, int y, int flag) {
        super(15, 8, 10, 10, 12, 32, 9, x, y, flag);
        this.name = name;
    }
    public String getName() {return name;}
    @Override
    public String getInfo() {
        return String.format(" Я снайпер %s, Здоровье: %d, Скорость: %d, Координаты: Х: %d, Y: %d.",
                name, getHp(), getSpeed(), getCoordinats().x, getCoordinats().y);
    }
}