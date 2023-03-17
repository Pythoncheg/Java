package OOP.PlaceOfWar;

import OOP.PlaceOfWar.units.*;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        ArrayList<BaseClass> black = new ArrayList<>();
        ArrayList<BaseClass> white = new ArrayList<>();
        FillCommand.CreateUnits(black, "black", 5);
        FillCommand.CreateUnits(white, "white", 5);
        ArrayList<BaseClass> all_units = new ArrayList<>();
        all_units.addAll(white);
        all_units.addAll(black);
        all_units.sort(new Comparator<BaseClass>() {
            @Override
            public int compare(BaseClass o1, BaseClass o2) {
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHp() - o1.getHp();
                else return (int) (o2.getSpeed()- o1.getSpeed());
            }
        });
        all_units.forEach(unit -> System.out.println(unit.getInfo()));
        System.out.println("\nBattle\n");
        for (int i = 0; i < 10; i++) {
            System.out.format("\nРаунд № %d\n\n", i+1);
            for (BaseClass human : all_units) {
                if (white.contains(human)) human.Step(white, black);
                else human.Step(black, white);
            }
            System.out.println("\nEnd Round\n");
            all_units.forEach(unit -> System.out.println(unit.getInfo()));
        }
        System.out.println("\nEnd game\n");

    }


}
