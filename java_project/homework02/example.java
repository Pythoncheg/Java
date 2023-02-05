// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

package java_project.homework02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class example {
    public static String extractDigits(String src) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (Character.isDigit(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public static double degree(double x, double y) {
        return Math.pow(x, y);
    
    }

    public static void printResult(double x, int a, int b) {
        if (a > 0 &&  b >= 0){
            int f = (int)x;
            System.out.println(f);
        } 
        if (a == 0 && b == 0) {
            System.out.println(" не определено");
        }
        if (a > 0 && b < 0){ 
            System.out.println(x);
        }
    }

    /**
     * @throws Exception
     */
    public static String fileRead() throws Exception {
        FileReader fr = new FileReader("java_project/homework02/input.txt");
        Scanner scan = new Scanner(fr);
        String a = "";
        String b;
        String x;
        while (scan.hasNextLine()) {
            x = scan.nextLine();
            if (x.contains("a")){
                a = extractDigits(x);
                System.out.println("Число " + a);
            }else{
                b = extractDigits(x);
                System.out.println("Степень " + b);
            }
            
        }
        return a;
        fr.close();
    }

    public static void fileWrite (double x) throws Exception {
        String str = Double.toString(x);
        FileWriter fw = new FileWriter("java_project/homework02/output.txt");
        fw.write(str);
        fw.close();
    }
     
    public static void main(String[] args) throws Exception {
        fileRead();
        // int a =
        // int b = 0;
        // double c = degree(a, b); //подумать над дробью!
        // printResult(c, a, b);
        // fileWrite(c);
    
    }
}
