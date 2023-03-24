package OOP.PlaceOfWar.units;

public class Outlaw extends Warrior {
    public Outlaw (String name, Vector2D coords){
        super(name, 100, 100, 2, 4, 3, 8, 6, coords.posX, coords.posY);
    }




    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Разбойник: \t").append(Outlaw.super.name)
                .append("\t| ATK:\t").append(Outlaw.super.attack)
                .append("\t| HP:\t").append(Outlaw.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Outlaw.super.coords.posX).append(".").append(Outlaw.super.coords.posY);
    }
    public String getName() {return name;}

}