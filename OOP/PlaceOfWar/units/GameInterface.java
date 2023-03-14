package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public interface GameInterface {

    String getInfo();
    int getSpeed();

    void Step(ArrayList<BaseClass> ally, ArrayList<BaseClass> enemy);
}
