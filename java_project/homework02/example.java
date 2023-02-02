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

    public static void fileRead() throws Exception {
        FileReader fr = new FileReader("java_project/homework02/input.txt");
        Scanner scan = new Scanner(fr);
        String a;
        String b;
        Boolean flag = false;
        while (scan.hasNextLine()) {
            if (flag == false) {
                a = scan.nextLine();
                flag = true;
                System.out.println("Первое " + a);
            }else {
                b = scan.nextLine();
                System.out.println("Второе " + b);
            }
            
            
        }
        fr.close();
    }

    public static void fileWrite (double x) throws Exception {
        String str = Double.toString(x);
        FileWriter fw = new FileWriter("java_project/homework02/output.txt");
        fw.write(str);
        fw.close();
    }
     
    public static void main(String[] args) throws Exception {
        int a = 3;
        int b = 0;
        double c = degree(a, b); //подумать над дробью!
        printResult(c, a, b);
        fileRead();
        fileWrite(c);
    
    }
}
