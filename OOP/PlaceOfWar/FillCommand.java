package OOP.PlaceOfWar;

import OOP.PlaceOfWar.units.*;

import java.util.ArrayList;
import java.util.Random;

public class FillCommand {
    static void CreateUnits(ArrayList arr, String command) {
        int r = 0;
        int w_x = 0; // координата Х для белых
        int b_x = 0; // координата Х для черных
        int y = 0;   // общая координата У
        for (int i = 0; i < 10; i++) {
            if (command == "white") {
                r = new Random().nextInt(4, 8);
                w_x = new Random().nextInt(1, 5);
                y = new Random().nextInt(1, 10);
            }
            if (command == "black") {
                r = new Random().nextInt(0, 4);
                b_x = new Random().nextInt(6, 10);
                y = new Random().nextInt(1, 10);
            }
            switch (r) {
                case 0:
                    arr.add(new Outlaw(getName(), b_x, y, 1));
                    break;
                case 1:
                    arr.add(new Sniper(getName(), b_x, y, 1));
                    break;
                case 2:
                    arr.add(new Magician(getName(), b_x, y, 1));
                    break;
                case 3:
                    arr.add(new Peasant(getName(), b_x, y, 1));
                    break;
                case 4:
                    arr.add(new Crossbowman(getName(), w_x, y, 2));
                    break;
                case 5:
                    arr.add(new Monk(getName(), w_x, y, 2));
                    break;
                case 6:
                    arr.add(new Spearman(getName(), w_x, y, 2));
                    break;
                case 7:
                    arr.add(new Peasant(getName(), w_x, y, 2));
            }
        }
    }
    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}