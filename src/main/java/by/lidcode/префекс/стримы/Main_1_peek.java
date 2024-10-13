package by.lidcode.префекс.стримы;

import java.util.stream.Stream;

public class Main_1_peek {
    public static void main(String[] args) {
        Stream<String> peek = Stream.of("A", "B", "C", "D")
                .peek(System.out::println);
        //  .forEach(System.out::println);
        peek.forEach(System.out::println);

        System.out.println("--------------");
        Stream.of("A", "B", "C", "D")
                .peek(System.out::println)
                .sorted()
                .forEach(System.out::println);

        System.out.println("--------------");
        Stream.of("A", "B", "C", "D")
                .peek(System.out::println)
                .distinct()
                .forEach(System.out::println);

        System.out.println("-----------------");
        Stream.of(4,1,5)
                .peek(System.out::println)// 415
                .sorted() //145
                .peek(System.out::println) //145
                .findFirst(); //1
                // В КОНСОЛЬ   4 1 5 1
        System.out.println("-----------------");
        Stream.of(1,2,4,1,5)
                .peek(System.out::println)// 1
                .filter(s->s%2 == 0)
                .peek(System.out::println) //2
                .findFirst();//2
        // В КОНСОЛЬ   122

        System.out.println("---------------");
        Stream.of(1,2,4,1,5)
                .peek(System.out::println)// 1
                .distinct()
                .peek(System.out::println) //1
                .findFirst();//11
        // В КОНСОЛЬ   11

        System.out.println("-----------------");
        var list = Stream.of("one", "two","three")
                .peek(s->s.replaceAll("o","O"))
                .map(s->s.replaceAll("e","E"))
                .toList();
        System.out.println(list);
    }
}
