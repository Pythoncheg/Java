package OOP.PlaceOfWar.units;

public class Vector2D {
    protected int posX, posY;
    public Vector2D(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }
    protected boolean isLeft(Vector2D opponent){
        return posX < opponent.posX;
    }
    protected double getDistance(Vector2D a){
        return Math.sqrt(Math.pow(posX -a.posX, 2) + Math.pow(posY -a.posY, 2));
    }
    protected Vector2D youGo(Vector2D opponent) {

        return new Vector2D(posX- opponent.posX, posY-opponent.posY);
    }
}
