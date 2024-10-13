package by.lidcode.строки;

import java.util.Arrays;
import java.util.List;

public class Main_3 {
    public static void main(String[] args) {
        // преобразовать список в 1 строку
        List<String> str = Arrays.asList("cat", "dog", "mam");
        System.out.println(String.join(",", str));
    }

    public static class Main_4 {
        public static void main(String[] args) {
            // получить 1 строку HWeolrllod
            String str1 = "Hello";
            String str2 = "World";

            System.out.println(addStr(str1, str2));
        }
        public static String addStr(String str1, String str2){
            StringBuilder sb = new StringBuilder();
            int maxLength = Math.max(str1.length(), str2.length());

            for (int i = 0; i < maxLength; i++) {
                if (i < str1.length()) {
                    sb.append(str1.charAt(i));
                }
                if (i < str2.length()) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
    }
}
