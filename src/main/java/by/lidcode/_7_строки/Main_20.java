package by.lidcode._7_строки;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main_20 {
    public static void main(String[] args) {
        // Подсчет общего количества букв
        System.out.println(countLetters("Hello, World!")); // 10
        System.out.println(countLetters("This is a test.")); // 11

        //Перестановка строк
        //Описание: Напишите метод, который проверяет, являются ли две строки перестановками друг друга.
        System.out.println(areAnagrams("listen?", "silent")); // true
        System.out.println(areAnagrams("hello", "world")); // false

        //Замена подстроки
        //Описание: Напишите метод, который заменяет все вхождения одного слова другим словом в строке.
        String str = "Hello, world! Hello!";
        String result = replaceSubstring(str, "Hello", "Hi");
        System.out.println(result); // Hi, world! Hi!

        //Реверс строки
        //Описание: Напишите метод, который реверсирует строку.
        System.out.println(reverse("Hello")); // olleH
        System.out.println(reverse("Java")); // avaJ

        //Уникальные символы
        //Описание: Напишите метод, который проверяет, все ли символы в строке уникальны (без учета регистра).
        System.out.println(areCharactersUnique("Hello")); // false
        System.out.println(areCharactersUnique("World")); // true

        System.out.println("-----------------");
        // Частотный анализ
        //Описание: Напишите метод, который находит частоту каждого символа в строке и выводит результат.
        System.out.println(isRotation("waterbottle", "erbottlewat")); // true
        System.out.println(isRotation("hello", "llohe")); // true
        System.out.println(isRotation("hello", "olelh")); // false

    }

    public static int countLetters(String str) {
        int count = 0;
        for (char i : str.toCharArray()) {
            if (Character.isLetter(i)) {
                count++;
            }
        }
        return count;
    }

    // public static int countLetters(String str){
    //        String cleanStr = str.replaceAll("[^A-Za-z]", "").toLowerCase(Locale.ROOT);
    //        char[] s = cleanStr.toCharArray();
    //        int count=s.length;
    //        return count;
    //    }

    public static boolean areAnagrams(String str1, String str2) {
        // Убираем пробелы и приводим к нижнему регистру
        str1 = str1.replaceAll("[^A-Za-z]", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Сравниваем длины строк
        if (str1.length() != str2.length()) {
            return false;
        }
// Сравниваем отсортированные символы строк
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static String replaceSubstring(String str, String toReplace, String replacement) {
        return str.replace("Hello", "Hi");
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean areCharactersUnique(String str) {
        String clean = str.replaceAll("[^A-Za-z]", "").toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char i : clean.toCharArray()){
            if (!set.add(i)){
                return false;
            }
        }
//        for (char i : clean.toCharArray()) {
//           if (set.contains(i)){ // Если символ уже есть в наборе, то не уникален
//                return false; // не уник
//            }
//           set.add(i);
//        }
        return true;
    }

   // "hello", "llohe"
    public static boolean isRotation (String str1, String str2){
// Проверяем, что длины одинаковы
        if (str1.length() != str2.length()) {
            return false;
        }
        // Соединяем str1 с самой собой и проверяем наличие str2
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}
