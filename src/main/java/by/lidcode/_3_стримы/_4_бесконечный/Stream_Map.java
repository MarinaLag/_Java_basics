package by.lidcode._3_стримы._4_бесконечный;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Map {
    public static void main(String[] args) {
//Дано: бесконечный стрим элементов от 1 до 255.
// Задача: при помощи стримов
//посчитать количество вхождений каждого уникального проходящего через стрим числа,
//ограничив стрим на 600 элементах

        Stream.iterate(0, i -> 1 + (int) (Math.random() * (255 - 1) + 1))
                .limit(600)
                .collect(Collectors.groupingBy(number -> number, Collectors.counting()));
    }
}
