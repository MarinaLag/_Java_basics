package by.lidcode._6_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main_2 {
    public static void main(String[] args) {
        // убрать дубликаты
        int[] nums = {1,1,2,5,1};
        System.out.println(Arrays.toString(removeDuplicates(nums)));

    }
    public static int[] removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        // Создаем массив для уникальных элементов
        int[] uniqueNums = new int[set.size()];
        int index = 0;

        // Заполняем массив уникальными элементами
        for (int i : set) {
            uniqueNums[index++] = i;
        }
        return uniqueNums;
    }
}
