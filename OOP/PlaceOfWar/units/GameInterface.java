package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public interface GameInterface {
    String getName();

    String getInfo();


    int getHp();

    int getSpeed();

    void step(ArrayList<BaseClass> ally, ArrayList<BaseClass> enemy);
}
