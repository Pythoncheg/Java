// Дан массив чисел, требуется получить новую выборку только четных чисел

package java_project.seminar01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task01 {
    public static int howLongNewArr(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {count++;}
        }
        return count;
    }
    
    public static int[] separator(int[] array, int len, int[] newArray) {
        int j = 0;
        for (int i = 0; i< array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    public static void printArr(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArr(numbers);
        int arrLength = howLongNewArr(numbers);
        int[] newArray = new int[arrLength];
        newArray = separator(numbers, arrLength, newArray);
        printArr(newArray);
    }
}
