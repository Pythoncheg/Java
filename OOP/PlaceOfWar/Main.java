package OOP.PlaceOfWar;

import OOP.PlaceOfWar.units.*;


public class Main {
    public static void main(String[] args) {
        Crossbowman hero1 = new Crossbowman("Arbaletter");
        System.out.println(hero1.Name());
        Magician hero2 = new Magician("Magamed");
        System.out.println(hero2.Name());
        Monk hero3 = new Monk("Monahagen");
        System.out.println(hero3.Name());
        Outlaw hero4 = new Outlaw("Razboing");
        System.out.println(hero4.Name());
        Peasant hero5 = new Peasant("Krestyanino");
        System.out.println(hero5.Name());
        Sniper hero6 = new Sniper("Sniperilla");
        System.out.println(hero6.Name());
        Spearman hero7 = new Spearman("Kopeishyka");
        System.out.println(hero7.Name());

    }

}
