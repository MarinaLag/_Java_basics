package by.lidcode._7_строки;

import java.util.Arrays;
import java.util.List;

public class Main_4 {
    public static void main(String[] args) {
     //   необходимо отсортировать строки в алфавитном порядке и преобразовать их в верхний регистр.
        List<String> strings = Arrays.asList("яблоко", "апельсин", "груша", "банан");
        List<String> res = strings.stream()
                .sorted()
                .map(String::toUpperCase)
                .toList();
        System.out.println(res);//[АПЕЛЬСИН, БАНАН, ГРУША, ЯБЛОКО]


      //  необходимо отфильтровать строки, длина которых больше 3 символов.
        List<String> strings1 = Arrays.asList("кот", "пес", "слон", "гном", "медведь" , "заяц");
        List<String> res1 = strings1.stream()
                .filter(s->s.length()>3)
                .toList();
        System.out.println(res1);


    }
}
