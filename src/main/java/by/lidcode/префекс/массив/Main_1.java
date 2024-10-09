package by.lidcode.префекс.массив;

import java.util.Arrays;

public class Main_1 {
    public static void main(String[] args) {
//        Даны два отсортированных массива arr1 и arr2.
//        Нужно создать новый отсортированный массив, содержащий все элементы из arr1 и arr2.
//  [1, 1, 2, 3, 4, 4]

       int [] arr1 = {1, 2, 4};
       int [] arr2 = {1, 3, 4};

       int[] res = new int[]{arr1.length+arr2.length};
       int x= arr1[0]; //1
       for (int i=0; i< res.length; i++){
           for (int j=0; j<arr1.length; j++){
               res[i]= arr1[j];
               System.out.println(res[i]);
           }
       }
       int temp = 0;
       for (int i=0; i<res.length; i++){

           for (int j=0; j<arr2.length; j++){
               int xx =arr2[i];
               if(res[i]<= xx && xx<res[i+1]){
               }
           }
       }

    }
}
