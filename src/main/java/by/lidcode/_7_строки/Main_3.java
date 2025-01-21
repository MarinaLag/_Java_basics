package by.lidcode._7_строки;

import java.util.Arrays;
import java.util.List;

public class Main_3 {
    public static void main(String[] args) {
        // преобразовать список в 1 строку
        List<String> str = Arrays.asList("cat", "dog", "mam");
        System.out.println(String.join(",", str));
    }

}
