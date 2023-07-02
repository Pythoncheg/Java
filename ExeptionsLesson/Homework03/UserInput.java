package ExeptionsLesson.Homework03;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public static String[] input() {
        String data = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ФИО, дату рождения, номер телефона и Ваш пол. Вводите данные через пробел.");
            data = scanner.nextLine();
            String[] arrDate = data.split(" ");
            if (arrDate.length == 6) {
                return arrDate;
            } else if (arrDate.length == 1) {
                ImputErors.eror(-1);
            } else if (arrDate.length < 6) {
                ImputErors.eror(-2);
            } else if (arrDate.length > 6) {
                ImputErors.eror(-3);
            }
        }
    }
}
