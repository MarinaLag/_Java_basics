package by.lidcode._3_стримы._2_list_string;

import java.util.Arrays;
import java.util.List;

public class Main_3 {
    public static void main(String[] args) {
        //  к верхнему регистру и отсортировать
        List<String> list = Arrays.asList("яблоко", "апельсин", "груша", "банан");
        List<String> str = list.stream()
                .sorted()
                .map(String::toUpperCase)
                .toList();
        System.out.println(str);

        //необходимо отфильтровать строки, длина которых больше 3 символов.
        List<String> list1 = Arrays.asList("кот", "пес", "слон", "гном", "медведь", "заяц");
        List<String> str1 = list1.stream()
                .filter(s -> s.length() > 3)
                .sorted()
                //.forEach(System.out::println);
                .toList();
        System.out.println(str1); //[гном, заяц, медведь, слон]
    }
}
