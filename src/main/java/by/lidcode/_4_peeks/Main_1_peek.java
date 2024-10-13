package by.lidcode._4_peeks;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main_1_peek {
    public static void main(String[] args) {
        Stream<String> peek = Stream.of("A", "B", "C", "D")
                .peek(System.out::println);
        //  .forEach(System.out::println);
        peek.forEach(System.out::println);

        System.out.println("-------2-------");
        Stream.of("A", "B", "C", "D")
                .peek(System.out::println)
                .sorted()
                .forEach(System.out::println);

        System.out.println("------3--------");
        Stream.of("A", "B", "A","C", "D")
                .peek(System.out::println)
                .distinct()
                .forEach(System.out::println);

        System.out.println("-------4----------");
        Stream.of(4,1,5)
                .peek(System.out::println)// 415
                .sorted() //145
                .peek(System.out::println) //145
                .findFirst(); //1 не выводит
                // В КОНСОЛЬ   4 1 5   1

        System.out.println("--------5---------");
        Stream.of(1,2,4,1,5)
                .peek(System.out::println)// 1
                .filter(s->s%2 == 0) //24
                .peek(System.out::println) //2
                .findFirst();//2 не выводит
        // В КОНСОЛЬ   12

        System.out.println("--------6-------");
        Stream.of(1,2,4,1,5)
                .peek(System.out::println)// 1
                .distinct()
                .peek(System.out::println) //1
                .findFirst();// 1 не выводит
        // В КОНСОЛЬ   11

        System.out.println("---------7--------");
        var list = Stream.of("one", "two","three")
                .peek(s->s.replaceAll("o","O"))
                .map(s->s.replaceAll("e","E"))
                .toList();
        System.out.println(list);

        System.out.println("--------8-----------");
        Stream.of(1,2,3,4,6)
                .filter(s->s%2==0) //246
                .peek(System.out::println) //2 4 6
                .toList(); // собререт но не выводит
        //246

        System.out.println("------9-----------");
        //`peek` — это промежуточная операция, которая используется для "подсмотривания" текущих элементов потока.
        Arrays.stream(new int[]{1, 4, 3})  //- Здесь создаётся поток целых чисел из массива `{1, 4, 3}`.
                .peek(System.out::println) // 1,4,3
                .sorted() // 1,3,4
                .peek(System.out::println) //1,3
                .anyMatch(i -> i == 3); // true
        // почему не выводит 4 зашол и вышел
        //  .findAny();// 1.4.3.1
        //143 13


        System.out.println("------10---------");
        Arrays.stream(new int[]{1, 4, 3,5})
                .peek(System.out::println)
                .peek(System.out::println)
                .anyMatch(i -> i == 3); // 114433 true

        System.out.println("--------11----------");
        Stream.of("A", "D", "C", "B")
                .peek(System.out::println) //A
                .map(s -> s + "1")       // a+1 но не выводит
                .peek(System.out::println) // a1
                .sorted() // a1 b1 c1 d1
                .forEach(System.out::println);
        // A A1 D D1 C C1 B B1  A1 B1 C1 D1

        System.out.println("--------12---------");
        Stream.of("A", "D", "C", "B")
                .peek(System.out::println)//a
                .map(s -> s + "1")  //a+1
                .peek(System.out::println) //a1
                .anyMatch(s -> s.contains("D")); // выходим
        //A A1 D D1

        System.out.println("--------13---------");
        Stream.of(1,2,3)
                .forEach(System.out::println);
    }
}
