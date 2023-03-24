package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public abstract class Manaman extends BaseClass{
    protected int magic;

    public Manaman(String name, float hp, int maxHp, int min_damage, int max_damage, int protection, int attack, int magic, int speed, int posX, int posY){
        super(name, hp, maxHp, min_damage, max_damage, protection, attack, speed, posX, posY);
        this.magic=magic;
    }
    @Override
    public void step(ArrayList<BaseClass> ally, ArrayList<BaseClass> enemy) {
        if (status.equals("Die")) return;
        BaseClass target = findWounded(ally);
        if (target.maxHp == target.hp) {
//            System.out.format("%s говорит, что лечить не кого!\n",
//                    getName());
            return;
        }
        target.getDamage(min_damage);
//        System.out.format("%s вылечил %s на %s\n", getName(), target.getName(), Math.abs(min_damage));
    }
}
