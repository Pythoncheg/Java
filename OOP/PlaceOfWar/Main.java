package OOP.PlaceOfWar;

import OOP.PlaceOfWar.units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<BaseClass> black = new ArrayList<>();
        ArrayList<BaseClass> white = new ArrayList<>();
        FillCommand(black, "black");
        FillCommand(white, "white");
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

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
    public static void FillCommand(ArrayList arr, String command){
        int r = 0;
        for (int i = 0; i < 10; i++) {
            if (command=="white") {
                r = new Random().nextInt(3, 7);
            }
            if (command=="black") {
                r = new Random().nextInt(0, 4);
            }
            switch (r) {
                case 0:
                    arr.add(new Outlaw(getName()));
                    break;
                case 1:
                    arr.add(new Sniper(getName()));
                    break;
                case 2:
                    arr.add(new Magician(getName()));
                    break;
                case 3:
                    arr.add(new Peasant(getName()));
                    break;
                case 4:
                    arr.add(new Crossbowman(getName()));
                    break;
                case 5:
                    arr.add(new Monk(getName()));
                    break;
                case 6:
                    arr.add(new Spearman(getName()));
                    break;
            }
        }
    }
}
