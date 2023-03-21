package OOP.PlaceOfWar.units;

public class Vector2D {
    protected int coordX, coordY;


    public Vector2D(int coordX, int coordY){
        this.coordX = coordX;
        this.coordY = coordY;
    }
    protected double getDistance(Vector2D a){
        return Math.sqrt(Math.pow(coordX -a.coordX, 2) + Math.pow(coordY -a.coordY, 2));
    }
}
