package OOP.PlaceOfWar.units;

public class Monk extends Manaman {

    public Monk(String name, Vector2D coords){
        super(name,100, 100, -4, -4, 7, 12, 1, 5, coords.posX, coords.posY);
    }





    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t| HP:\t").append(Monk.super.hp)
                .append(" \t| MP:\t").append(Monk.super.magic)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.coords.posX).append(".").append(Monk.super.coords.posY);
    }
}