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
            if (c == '-' || Character.isDigit(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public static double degree(int x, int y) {
        return Math.pow(x, y);
    
    }

    public static void printResult(double x, int a, int b) throws Exception {
        if (a > 0 &&  b >= 0){
            int f = (int)x;
            System.out.println(f);
            String str = Integer.toString(f);
            FileWriter fw = new FileWriter("java_project/homework02/output.txt");
            fw.write(str);
            fw.close();
        } 
        if (a == 0 && b == 0) {
            System.out.println("не определено");
            String str = "не определено";
            FileWriter fw = new FileWriter("java_project/homework02/output.txt");
            fw.write(str);
            fw.close();
        }
        if (a > 0 && b < 0){ 
            System.out.println(x);
            String str = Double.toString(x);
            FileWriter fw = new FileWriter("java_project/homework02/output.txt");
            fw.write(str);
            fw.close();
        }
    }


    public static String fileRead(int flag) throws Exception {
        FileReader fr = new FileReader("java_project/homework02/input.txt");
        Scanner scan = new Scanner(fr);
        String a = "";
        String b = "";
        String x;
        while (scan.hasNextLine()) {
            x = scan.nextLine();
            if (x.contains("a")){
                a = extractDigits(x);
            }else{
                b = extractDigits(x);
            }
            
        }
        fr.close();
        if (flag == 1){
            return a;
        }else{
            return b;
        }
    }
     
    public static void main(String[] args) throws Exception {
        String a = (fileRead(1));
        String b = (fileRead(2));
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        double c = degree(x, y);
        printResult(c, x, y);
    }
}
