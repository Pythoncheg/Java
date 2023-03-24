package OOP.PlaceOfWar;

import OOP.PlaceOfWar.units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
public class main {
    static final int UNITS = 10;
    public static final ArrayList<BaseClass> darkTeam = new ArrayList<>();
    public static final ArrayList<BaseClass> holyTeam = new ArrayList<>();
    public static final ArrayList<BaseClass> allTeam = new ArrayList<>();

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Нажмите Enter для начала.");




        user_input.nextLine();
        createTeam(holyTeam, 0, 1);
        createTeam(darkTeam, 3, 10);

        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(allTeam);

        while (true) {
            View.view();
            user_input.nextLine();
            for (BaseClass human : allTeam) {
                if (holyTeam.contains(human)) human.step(holyTeam, darkTeam);
                else human.step(darkTeam, holyTeam);
            }
        }
//        all_units.forEach(unit -> System.out.println(unit.getInfo()));
//        System.out.println("\nBattle\n");
//        for (int i = 0; i < 5; i++) {
//            System.out.format("\nРаунд № %d\n\n", i+1);
//            for (BaseClass human : all_units) {
//                if (white.contains(human)) human.step(white, black);
//                else human.step(black, white);
//            }
//            System.out.println("\nEnd Round\n");
//            all_units.forEach(unit -> System.out.println(unit.getInfo()));
    }

    static void createTeam(ArrayList team, int offset, int posY) {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4) + offset;
            switch (rnd) {
                case (0):
                    team.add(new Sniper(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (1):
                    team.add(new Outlaw(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (2):
                    team.add(new Magician(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (3):
                    team.add(new Peasant(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (4):
                    team.add(new Crossbowman(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (5):
                    team.add(new Monk(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (6):
                    team.add(new Spearman(getName(), new Vector2D(i + 1, posY)));
                    break;
            }
        }
        
    }
    static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
    static void sortTeam (ArrayList<BaseClass> team){
        team.sort(new Comparator<BaseClass>() {
            @Override
            public int compare(BaseClass t0, BaseClass t1) {
                if (t1.getSpeed() == t0.getSpeed()) return (int) (t1.getHp() - t0.getHp());
                else  return (int) (t1.getSpeed() - t0.getSpeed());
            }
        });
    }
}
