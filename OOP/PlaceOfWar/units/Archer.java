package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public abstract  class Archer extends BaseClass{
    private int shots;



    public Archer(int hp, int min_damage, int max_damage, int protection, int attack, int shots, int speed, int x, int y, int flag) {
        super(hp, min_damage, max_damage, protection, attack, speed, x, y, flag);
        this.shots=shots;
    }
    @Override
    public void Step(ArrayList<BaseClass> ally, ArrayList<BaseClass> enemy) {
        if (status.equals("Die") || shots == 0) return;
        BaseClass target = enemy.get(findNear(enemy));
        float damage = (target.protection - attack)>0 ? min_damage : (target.protection - attack)<0 ? max_damage : (min_damage + max_damage)/2;
        target.getDamage(damage);
        for (BaseClass baseClass: ally) {
            if (baseClass.getInfo().equals("крестьянин") && baseClass.status.equals("Stand")) {
                baseClass.status = "Busy";
                return;
            }
        }
        shots--;
        }





    private int getShots() {
        return shots;
    }

}
