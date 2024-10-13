package by.lidcode.префекс.массив;

import java.util.HashSet;
import java.util.Set;

public class Main_2 {
    public static void main(String[] args) {

        int[] nums = {1,1,2};
    }

    public int[] removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int counter = 0;
        for (int i : set) {
            set.add(i);
            counter++;
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
