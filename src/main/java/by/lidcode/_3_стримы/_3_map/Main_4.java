package by.lidcode._3_стримы._3_map;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main_4 {
    public static void main(String[] args) {
        // если повторяются разное количество раз
        //1-3
        //2-2
        //3-1
        // true
        int[] arr = {1,2,2,1,1,3};
        System.out.println(coutRes(arr));

    }
    public static boolean coutRes(int[] arr){
        // Подсчитываем количество вхождений и проверяем уникальность количеств
        Map<Long, Long> map = Arrays.stream(arr)
                .boxed() //получить поток объектов Integer
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
               //Function.identity() как функцию, возвращающую сам элемент
                .values()
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Проверяем, что все количества вхождений уникальны
        return map.size() == map.values().size();
    }
}
