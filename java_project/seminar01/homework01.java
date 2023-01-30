package java_project.seminar01;

import java.io.Console;
import java.util.Scanner;

public class homework01 {
    private static Scanner input = new Scanner(System.in);
    

    public static int getLength(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    public static void main(String[] args) {
        int count = getLength("Укажите количество последовательностей треугольных чисел: ");
        for(int i = 1; i<=count; i++){
            int t = i*(i+1)/2;
            System.out.printf("%s ", t);
        }
    }
}
