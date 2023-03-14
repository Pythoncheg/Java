package OOP.PlaceOfWar;

import OOP.PlaceOfWar.units.*;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        ArrayList<BaseClass> black = new ArrayList<>();
        ArrayList<BaseClass> white = new ArrayList<>();
        FillCommand.CreateUnits(black, "black");
        FillCommand.CreateUnits(white, "white");
        ArrayList<BaseClass> all_units = new ArrayList<>();
        all_units.addAll(white);
        all_units.addAll(black);
        all_units.sort(new Comparator<BaseClass>() {
            @Override
            public int compare(BaseClass o1, BaseClass o2) {
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHp() - o1.getHp();
                return o2.getSpeed()- o1.getSpeed();
            }
        });
        all_units.forEach(unit -> System.out.println(unit.getInfo()));

    }


}
