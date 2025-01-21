package by.lidcode._3_стримы._1_list_integer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Mainn_7 {
    public static void main(String[] args) {
        // Дан отсортированный по возрастанию массив целых чисел, задача - удалить дубликаты
// чисел, так чтобы все уникальные числа располагались по порядку с начала массива.
// [0,0,1,1,1,2,2,3,3,4] -> [0,1,2,3,4]
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
   removeDuplicates(arr);
    }

    public static void removeDuplicates(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for (int i :nums){
            set.add(i);
        }
       set.stream()
               .sorted()
               .forEach(System.out::println);
    }

}
