package by.lidcode._6_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_20 {
    public static void main(String[] args) {
        // метод, который заменяет дубликаты на _ из массива чисел
        int[] nums = {1, 1, 2};
        String[] result = chang(nums);
        System.out.println(Arrays.toString(result)); // Вывод: [1, _, 2]

    }

    public static String[] chang(int[] nums) {
        List<Integer> list = new ArrayList<>();
        String[] result = new String[nums.length]; // Массив для хранения результата

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (list.contains(num)) {
                result[i] = "_"; // Заменяем дубликаты на "_"
            } else {
                list.add(num); // Добавляем уникальные значения в список
                result[i] = Integer.toString(num); // Сохраняем уникальное значение в результирующем массиве
            }
        }
        return result; // Возвращаем массив с заменами
    }
}
