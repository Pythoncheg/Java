package OOP.PlaceOfWar.units;

public class Coordinats {
    protected int x, y;

    public Coordinats(int x, int y){
        this.x=x;
        this.y=y;
    }
    protected double getDistance(Coordinats a){
        return Math.sqrt(Math.pow(x-a.x, 2) + Math.pow(y-a.y, 2));
    }
}
