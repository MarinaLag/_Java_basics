package by.lidcode._3_стримы;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatStream {
    List<String> list = Arrays.asList("a", "b", "c");
    Stream<String> streamFromList = list.stream();

    List<Integer> list1 = Arrays.asList(1,2,3,4);

    Stream<String> parallelStreamFromList = list.parallelStream();

    String[] array = { "a", "b", "c" };
    Stream<String> streamFromArray1 = Stream.of(array);
    Stream<String> streamFromArray2 = Arrays.stream(array);
}
