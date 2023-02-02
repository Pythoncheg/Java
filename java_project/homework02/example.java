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

public class example {
    public static double degree(double x, double y) {
        return Math.pow(x, y);
    
    }

    public static void print(double x, int a, int b) {
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

    public static void fileProcess() {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/java_project/homework02/input.txt");
            File f = new File(pathFile);
            
            System.out.println("try");
            } catch (Exception e) {
                System.err.println(e);
            }
            finally {
                System.out.println("Финал");
            }
    }
public static void main(String[] args) {
    int a = 3;
    int b = 0;
    double c = degree(a, b);
    print(c, a, b);
    fileCreate();
}
}
