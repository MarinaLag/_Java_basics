package by.tasks.stream;

import java.util.Arrays;

public class Main_3_peek {
    public static void main(String[] args) {
        // Какой буддет ответ
        Arrays.stream(new int[]{1, 4, 3})  //- Здесь создаётся поток целых чисел из массива `{1, 4, 3}`.
 //`peek` — это промежуточная операция, которая используется для "подсмотривания" текущих элементов потока.
                .peek(System.out::println) // 1,4,3
                .sorted() // 1,3,4
                .peek(System.out::println) //1
                //на данный момент в потоке только первый элемент отсортированного потока, который равен `1`.
                .anyMatch(i -> i == 3); //1,4,3,  1,  3
    }
}
