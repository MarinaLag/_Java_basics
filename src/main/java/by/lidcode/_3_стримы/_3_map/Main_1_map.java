package by.lidcode._3_стримы._3_map;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_1_map {
    public static void main(String[] args) {
        // 3 4 6 8 5 10 8 6 6 4
        // вывести на экран все четные кроме 4: hello число - количество повторений
        Map<String, Long> collect = Stream.of(3, 4, 6, 8, 5, 10, 8, 6, 6, 4)
                .filter(s -> s != 4)
                .filter(s -> s % 2 == 0)
                .collect(Collectors.groupingBy(s -> "Hello " + s,Collectors.counting()));

        System.out.println(collect); //{Hello 8=2, Hello 6=3, Hello 10=1}


    }
}
