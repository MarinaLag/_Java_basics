package by.lidcode._3_стримы._1_list_integer;

import java.util.Arrays;
import java.util.List;

public class Main_1 {
    public static void main(String[] args) {
        //Необходимо найти сумму всех чисел, начиная с пятого по порядку, которые делятся на 3 или 5.
// Но есть дополнительное условие: если таких чисел больше 10, то складываешь только первые 10 из них.
        List<Integer> numbers = Arrays.asList(1, 15, 2, 3, 7, 20, 8, 9, 12, 5, 30, 4, 11, 18, 25);

        int sum = numbers.stream()
                .skip(5)
                .filter(s->s%3 ==0 ||s%5 == 0)
                .limit(10)
                .mapToInt(Integer::intValue) // преобразуем Integer в int
                .sum();
        System.out.println(sum);

    }
}
