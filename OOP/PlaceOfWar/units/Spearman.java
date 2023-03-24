package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public class Spearman extends Warrior {
    public Spearman(String name, Vector2D coords){
        super(name, 100, 100, 1, 3, 5, 4, 4, coords.posX, coords.posY);
    }
    public String getName() {return name;}
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.coords.posX).append(".").append(Spearman.super.coords.posY);
    }

}