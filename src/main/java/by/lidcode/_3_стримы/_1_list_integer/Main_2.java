package by.lidcode._3_стримы._1_list_integer;

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

        System.out.println("------1-------");
        list.stream()
                .filter(s -> s % 2 == 0)
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("---------2----------");
        // четные умножить на 2 и поститает их кол-во и вывести
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Long res = arr.stream()
                .filter(s -> s % 2 == 0) // 2,4,6,8,10
                .map(s -> s * 2)  // 4 8 12,16,20
                // .collect(Collectors.toList());
                // .toList();
                .count();// посчитает

        System.out.println(res);//5
    }
}
