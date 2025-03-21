package by.lidcode._3_стримы._2_list_string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main_2 {
    public static void main(String[] args) {
        //получить список городов начинающихся на А в Uppercase, отсортированными
        List<String> list = Arrays.asList("Москва", "Архангельск", "Астрахань", "Минск", "Антверпень");

        List<String> listRes = list.stream()
                .filter(s -> s.startsWith("А")) //фильтруем по А
                .map(String::toUpperCase)       // переводим в вверхний регистр
                .sorted()
                .collect(Collectors.toList());    //собирает элементы вашего стрима в список

        System.out.println(listRes);   // =>[АНТВЕРПЕНЬ, АРХАНГЕЛЬСК, АСТРАХАНЬ]

    }

}
