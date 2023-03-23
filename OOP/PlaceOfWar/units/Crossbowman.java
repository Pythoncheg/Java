package OOP.PlaceOfWar.units;

public class Crossbowman extends Archer {

    public Crossbowman(String name, Vector2D coords){
        super(name,4, 2,3, 3, 6, 16, 4, coords.coordX, coords.coordY);
    }




    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалетчик: \t").append(Crossbowman.super.name)
                .append("\t| ATK:\t").append(Crossbowman.super.attack)
                .append("\t| HP:\t").append(Crossbowman.super.hp)
                .append(" \t| Стрелы:").append(Crossbowman.super.shots)
                .append("\t|").append("\t| (X.Y) : ").append(Crossbowman.super.coords.coordX).append(".").append(Crossbowman.super.coords.coordY);
    }
    public String getName() {return name;}



}
