package by.lidcode._aaaaaaaaaaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Mainy_6 {
    public static void main(String[] args) {
        //Дано: бесконечный стрим элементов от 0 до 255. Задача: при помощи стримов посчитать
        // количество вхождений каждого уникального проходящего через стрим числа,
        // ограничив стрим на 600 элементах (Запрещено использовать структуру данных Map)
        Stream.iterate(1, i -> 1 + (int) (Math.random() * (255 - 1) + 1));

        //Найти длину последнего слова в строке
//"Hello World" - 5
//"   fly me   to   the moon  " - 4

        //   String[] str=
//        Stream.of("Hello World");
//        Arrays.stream()

        String str = "Hello World";
    //    System.out.println(lengthOfLastWord(str));

    }

//    public static int lengthOfLastWord(String s) {
//        int res = 0;
//        String[] strA = s.split(" ");
//        return Arrays.stream(strA)
//                .map(str -> str[ - 1])
//                .mapToInt(String::length) //5
//                .reduce(0, (first, second) -> second);
//    }
}
