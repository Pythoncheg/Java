package OOP.PlaceOfWar.units;

import java.util.ArrayList;

public interface GameInterface {
    StringBuilder getInfo();

    void step(ArrayList<BaseClass> ally, ArrayList<BaseClass> enemy);
}
