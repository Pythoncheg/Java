package OOP.PlaceOfWar.units;

public class Monk extends Manaman {



    protected String name;

    public Monk(String name, int x, int y, int flag){
        super(30, -4, -4, 7, 12, 1, 5, x, y, flag);
        this.name = name;
    }





    @Override
    public String getInfo() {
        return String.format(" Я монах %s, Здоровье: %d, Скорость: %d, Координаты: Х: %d, Y: %d.",
                name, getHp(), getSpeed(), getCoordinats().coordX, getCoordinats().coordY);
    }
    public String getName() {return name;}

}