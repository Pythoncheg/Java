package OOP.PlaceOfWar.units;

public class Magician extends Manaman {

    public Magician(String name, Vector2D coords){
        super(name,100, 100, -5, -5, 12, 17, 1, 9, coords.posX, coords.posY);
    }





    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Маг: \t").append(Magician.super.name)
                .append("\t| ATK:\t").append(Magician.super.attack)
                .append("\t| HP:\t").append(Magician.super.hp)
                .append(" \t| MP:\t").append(Magician.super.magic)
                .append("\t|").append("\t| (X.Y) : ").append(Magician.super.coords.posX).append(".").append(Magician.super.coords.posY);
    }
    public String getName() {return name;}


}