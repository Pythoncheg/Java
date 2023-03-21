package OOP.PlaceOfWar.units;

public class Magician extends Manaman {

    protected String name;

    public Magician(String name, int x, int y, int flag){
        super(30, -5, -5, 12, 17, 1, 9, x, y, flag);
        this.name = name;
    }





    @Override
    public String getInfo() {
        return String.format(" Я маг %s, Здоровье: %d, Скорость: %d, Координаты: Х: %d, Y: %d.",
                name, getHp(), getSpeed(), getCoordinats().coordX, getCoordinats().coordY);
    }
    public String getName() {return name;}


}