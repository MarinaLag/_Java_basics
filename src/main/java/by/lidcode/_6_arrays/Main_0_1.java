package by.lidcode._6_arrays;

import java.util.Arrays;

public class Main_0_1 {
    public static void main(String[] args) {
        // вывод матрицы!!!!!

        System.out.println("--------первый способ-----------");
        int[][] arr = {{1, 2, 3},
                {4, 5}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" получить элемент = " + arr[1][1]); //5

        System.out.println("--------второй способ-----------");

        for (int[] row : arr) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println(" ");
        }


        System.out.println("--------третий способ-----------------");
        for (int[] row : arr)
            System.out.println(Arrays.toString(row));
    }
}
