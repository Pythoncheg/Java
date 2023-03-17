package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public abstract class Manaman extends BaseClass{
    private int magic;

    public Manaman(int hp, int min_damage, int max_damage, int protection, int attack, int magic, int speed, int x, int y, int flag){
        super(hp, min_damage, max_damage, protection, attack, speed, x, y, flag);
        this.magic=magic;
    }
    @Override
    public void Step(ArrayList<BaseClass> ally, ArrayList<BaseClass> enemy) {
        if (status.equals("Die")) return;
        BaseClass target = ally.get(findWounded(ally));
        target.getDamage(min_damage);
        System.out.format("%s вылечил %s на %s\n", getName(), target.getName(), Math.abs(min_damage));
    }
}
