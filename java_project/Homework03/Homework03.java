// Дана прямоугольная карта размера MxN (N, M меньше 20)
// На карте стоит фигура в точке(Х, Y), 
// которая может ходить на одну клеточку вправо или вниз за один ход
// Посчитать количество маршрутов, которым фигура может попасть в нижнюю правую клетку
// * * На карте могут быть стены
// * ** M и N могут быть до 1000
// Задачу разбить на методы

package java_project.Homework03;

import java.util.Arrays;

public class Homework03 {

    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        int[] wall = {6,6};
        int[][] x = CreatingField(m, n);
        FillArray(x, wall);
        if (wall[0] < 1 && wall[1] < 1){
            System.out.println("Ошибка! Стена в начале пути!");
        }else{
        System.out.println(Arrays.deepToString(x));
        System.out.println("Количество путей ="+x[m-1][n-1]);
        }
    }

    // public static void PrintArray(a[]){
    //     for (int[] array: a){
    //         System.out.println(Arrays.toString(array));
    //     }
    // }

    public static int[][] CreatingField(int a, int b) {
        return new int[a][b];
    }

    public static void FillArray(int[][] x, int[] w) {
        for (int i = 0; i<x.length; i++){
            for (int j = 0; j < x[0].length; j++){
                if (i==w[0] && j==w[1]){
                    x[i][j] = 0;
                    j++;
                    }
                if (x[0][0] == 0){
                    x[i][j]+=1;
                } 
                else if (x[0][j] == 0){
                    x[i][j]+=1;
                }
                else if (x[i][0] == 0){
                    x[i][j]+=1;
                }
                else{
                    x[i][j]=x[i][j-1]+x[i-1][j];
                }
            }
        }
        
    }
}