package by.lidcode._3_стримы._5_итератор;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main_1 {
    public static void main(String[] args) {
//Реализовать метод, который отсортирует все четные элементы входящего листа по возрастанию,
//а нечетные оставит на своих местах
        //(1, 4, 5, 2) - вход
        //(1, 2, 5, 4) - выход

        List<Integer> list1 = Arrays.asList(1, 4, 5, 2);
        System.out.println(someWeirdSorting(list1)); //[1, 2, 5, 4]

    }
    public static List<Integer> someWeirdSorting(List<Integer> list1) {
        List<Integer> evenNumbers = list1.stream() //(1, 4, 5, 2)
                .filter(s -> s % 2 == 0) //(4, 2)
                .sorted() // 2, 4
                .toList();

        Iterator<Integer> evenIter = evenNumbers.iterator();
        //evenIter.next() -- 2
        //evenIter.next() -- 4

        //(a) -> a.getName()
        return list1.stream() //(1, 2, 5, 4)
                .map(s -> {
                            if (s % 2 == 0) {
                                return evenIter.next();
                            } else {
                                return s;
                            }
                        }
                ).toList();
    }
}
