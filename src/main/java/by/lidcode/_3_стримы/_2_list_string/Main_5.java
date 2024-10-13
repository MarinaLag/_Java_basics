package by.lidcode._3_стримы._2_list_string;

import java.util.Arrays;
import java.util.List;

public class Main_5 {
    public static void main(String[] args) {
        // Дан список из строк
        // Вывести общее число всех уникальных символов в строках
        List<String> list1 = List.of("abcaa", "bcde", "ccaa"); // => 5

        //Метод `count()` возвращает значение типа `long`, поэтому если вы попытаетесь использовать `int`,
        // вам нужно будет преобразовать `long` в `int`, что может привести к потере данных при переполнении.
        long distinctCount = list1.stream()
                .flatMap(x -> {
                    String[] s = x.split("");
                    return Arrays.stream(s);
                })
                .distinct()
                .count();
        System.out.println(distinctCount);
    }
}
