package by._java_SE._5_arrays;

import java.util.Arrays;

public class Main_1 {
    public static void main(String[] args) {

        int [] arr = new int[5];

        int max = 1, min = 10;
        for (int i =0; i< arr.length; i++){
            arr[i] = (int)(Math.random()*(max-min+1)+min);
        }
        System.out.println(Arrays.toString(arr));

//        for (int i : arr) {
//            arr[i] = (int)(Math.random()*(max-min+1)+min);
//        }
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arrDelete = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(arrDelete));

        int[] arrAdd = Arrays.copyOf(arr,arr.length+5);
        System.out.println(Arrays.toString(arrAdd));


    }
}
