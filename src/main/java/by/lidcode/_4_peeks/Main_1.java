package by.lidcode._4_peeks;

import java.util.stream.Stream;

public class Main_1 {
    public static void main(String[] args) {
        Stream.of(4,3,2,1)
                .peek(System.out::println)
                .filter(s->s%2==0)
                .peek(System.out::println)
                .sorted()
                .forEach(System.out::println);
    }
}
