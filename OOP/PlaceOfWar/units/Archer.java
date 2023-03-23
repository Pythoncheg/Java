package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public abstract  class Archer extends BaseClass{
    protected int shots;



    public Archer(String name, int hp, int min_damage, int max_damage, int protection, int attack, int shots, int speed, int x, int y) {
        super(name, hp, min_damage, max_damage, protection, attack, speed, x, y);
        this.shots=shots;
    }
    @Override
    public void step(ArrayList<BaseClass> ally, ArrayList<BaseClass> enemy) {
        if (status.equals("Die") || shots == 0) return;
        BaseClass target = enemy.get(findNear(enemy));
        float damage = (target.protection - attack)>0 ? min_damage : (target.protection - attack)<0 ? max_damage : (min_damage + max_damage)/2;
        target.getDamage(damage);
//        System.out.format("%s бьет %s и тот получает %s урона\n",getName(), target.getName(), damage );
        for (BaseClass baseClass: ally) {
            if (baseClass.getSupport() == true  && baseClass.status.equals("Stand")) {
                baseClass.status = "Busy";
//                System.out.format("%s нашел свободного крестьянина %s\n", getName(), baseClass.getName());
                return;
            }
        }
        shots--;
//        System.out.format("%s не нашел крестьянина\n", getName());
        }

    private int getShots() {
        return shots;
    }

}
