package OOP.PlaceOfWar.units;

public class Sniper extends Archer {
    public Sniper(String name, Vector2D coords) {
        super(name, 15, 8, 10, 10, 12, 32, 9, coords.coordX, coords.coordY);
    }


    public String getName() {return name;}
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.hp)
                .append(" \t| Arrows:").append(Sniper.super.shots)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coords.coordX).append(".").append(Sniper.super.coords.coordY);
    }
}