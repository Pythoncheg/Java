package Algoritms;

import java.util.Random;

import static Algoritms.sem02_2.quickSort;

public class sem02_1 {
    public static void main(String[] args) {
        int[] array = CreateArray(1000);
        long start = System.nanoTime();
        bubbleSort(array);
        long end = System.nanoTime();
        System.out.println(end - start);
        array = CreateArray(1000);
        start = System.nanoTime();
        ShakerSort(array);
        end = System.nanoTime();
        System.out.println(end - start);
        array = CreateArray(1000);
        start = System.nanoTime();
        quickSort(array, 0, array.length-1);
        end = System.nanoTime();
        System.out.println(end - start);
    }
    public static int[] CreateArray(int n) {
        int[] array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }


        public static void bubbleSort(int[] arr) {
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swapped = true;
                    }
                }
            }
        }
    public static void ShakerSort(int[] values) {
        if (values.length == 0) {
            return;
        }
        int left = 0;
        int right = values.length - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (values[i - 1] > values[i]) {
                    int temp = values[i];
                    values[i] = values[i - 1];
                    values[i - 1] = temp;
                }
            }
            ++left;
            for (int i = left; i < right; ++i) {
                if (values[i] > values[i + 1]) {
                    int temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
//                    swap(values[i], values[i + 1]);
                }
            }
            --right;
        }
    }
    }