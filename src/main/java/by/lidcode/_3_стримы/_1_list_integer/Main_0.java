package by.lidcode._3_стримы._1_list_integer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main_0 {
    public static void main(String[] args) {
        // дан список целых чисел
        // для каждого числа вывести в консоль само число + количество его дубликатов

        List<Integer> list = List.of(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);
        list.stream()
                //  .collect(Collectors.groupingBy(k->k))// сгруппировали
                .collect(Collectors.groupingBy(Function.identity()))// сгруппировали
                .forEach((k, v) -> {
                    System.out.println(k + " = " + v.size());// size выводит количество в массиве
                });
        //1 = 1
        //2 = 2
        //3 = 1
        //4 = 2
        //5 = 3
        //6 = 1

        //1 = [1]
        //2 = [2, 2]
        //3 = [3]
        //4 = [4, 4]
        //5 = [5, 5, 5]
        //6 = [6]
    }
}
