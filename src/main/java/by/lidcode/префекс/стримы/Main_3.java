package by.lidcode.префекс.стримы;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main_3 {
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
