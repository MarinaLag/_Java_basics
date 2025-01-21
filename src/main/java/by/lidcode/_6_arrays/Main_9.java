package by.lidcode._6_arrays;

import java.util.Arrays;

public class Main_9 {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9}; // 10000
        System.out.println(Arrays.toString(plus(arr)));

    }

    // 1950
    public static int[] plus(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 9) {
                arr[i] = arr[i] + 1;
                return arr;
            } else {
                arr[i] = 0;
            }
        }

        arr = new int[arr.length + 1]; // 0 0 0 0 0
        arr[0] = 1;
        return arr;
    }

}