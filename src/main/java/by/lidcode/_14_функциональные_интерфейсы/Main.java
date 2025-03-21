package by.lidcode._14_функциональные_интерфейсы;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = (x) -> x > 4;
        System.out.println("Predicate = " + isPositive.test(2));

        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println("BinaryOperator = " + multiply.apply(5, 10));

        UnaryOperator<Integer> square = (x) -> x * x;
        System.out.println("UnaryOperator = " + square.apply(5));

        Function<Integer, String> converter = (x) -> String.valueOf(x);
        System.out.println("Function = " + converter.apply(10) + 1);
        // если бы не преобразовал, то было бы 11

        Consumer<Integer> print = (x) -> System.out.println("Consumer = " + x);
        print.accept(45);

        Supplier<String> strString = () -> {
            String s = new Scanner(System.in).nextLine();
            return s;
        };
        System.out.println("Введите значение: ");
        strString.get();

    }
}
