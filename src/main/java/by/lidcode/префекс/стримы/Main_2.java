package by.lidcode.префекс.стримы;

import java.util.Arrays;
import java.util.List;

public class Main_2 {
    public static void main(String[] args) {
        // Найти первое четное число  в списке целых чисел
        List<Integer> list = Arrays.asList(1, 3, 5, 6, 8, 9);

        Integer x = list.stream()
                .filter(s -> s % 2 == 0)
                .findFirst().get();
        System.out.println(x); //6

        list.stream()
                .filter(s -> s % 2 == 0)
                .sorted()
                .limit(1)
                .forEach(System.out::println);
    }
}
