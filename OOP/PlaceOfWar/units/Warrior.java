package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public abstract class Warrior extends BaseClass {
    public Warrior(String name, float hp, int maxHp, int min_damage, int max_gamage, int protection, int attack, int speed, int posX, int posY) {
        super(name, hp, maxHp, min_damage, max_gamage, protection, attack, speed, posX, posY);
    }

    @Override
    public void step(ArrayList<BaseClass> ally, ArrayList<BaseClass> enemy) {
        if (status.equals("Die")) return;
        BaseClass target = enemy.get(findNear(enemy));
        if (target.coords.getDistance(coords) < 2) {
            float damage = (target.protection - attack) > 0 ?
                    min_damage : (target.protection - attack) < 0 ?
                    max_damage : (min_damage + max_damage) / 2;
            target.getDamage(damage);
        } else {
            Vector2D temp = coords.youGo(target.coords);
            if (Math.abs(temp.posX) < Math.abs(temp.posY)) {
                if (coords.youGo(target.coords).posY > 0) {
                    coords.posY--;
                } else {
                    coords.posY++;
                }
            } else {
                if (coords.youGo(target.coords).posX > 0) {
                    coords.posX--;
                } else {
                    coords.posX++;
                }
            }
        }
    }
}





