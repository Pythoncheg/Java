package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public interface GameInterface {
    String getName();

    String getInfo();
    int getSpeed();

    void Step(ArrayList<BaseClass> ally, ArrayList<BaseClass> enemy);
}
