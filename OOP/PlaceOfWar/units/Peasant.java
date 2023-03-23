package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public class Peasant extends BaseClass {
    protected String name;
    protected int support = 1;

    public Peasant(String name, Vector2D coords){
        super(name, 1, 1, 1, 1, 3, 3, coords.coordX, coords.coordY);

    }



    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Peasant.super.name)
                .append("\t| ATK:\t").append(Peasant.super.attack)
                .append("\t| HP:\t").append(Peasant.super.hp)
                .append(" \t| Arrows: ").append(Peasant.this.support)
                .append("\t|").append("\t| (X.Y) : ").append(Peasant.super.coords.coordX).append(".").append(Peasant.super.coords.coordY);
    }
    public String getName() {return name;}

    @Override
    public void step(ArrayList ally, ArrayList enemy) {
        if (status.equals("Die")) return;
        else {
            status = "Stand";
        }
    }
    @Override
    public boolean getSupport(){
        if (support ==1) return true;
        return false;
        }
}