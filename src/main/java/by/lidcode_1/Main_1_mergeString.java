package by.lidcode_1;

public class Main_1_mergeString {
    public static void main(String[] args) {
        // a p b q c r
        String word1 = "abc";
        String word2 = "pqr";
        String res = mergeAlternately(word1, word2);
        System.out.println("res " + res);
        String res1 = mergeAlternately1(word1, word2);
        System.out.println("res1 " + res1);

        System.out.println("=========================");
        // a p b q r s
        String word11 = "ab";
        String word22 = "pqrs";
        String res2 = mergeAlternately2(word11, word22);
        System.out.println("res3 " + res2);
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }
        return result.toString(); // преобразуем в строку
    }

    public static String mergeAlternately1(String word1, String word2) {
        String res = "";
       // int maxLength = word1.length() + word2.length();
        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                res += word1.charAt(i);
            }
            if (i < word2.length()) {
                res += word2.charAt(i);
            }
        }
        return res;
    }

    public static String mergeAlternately2(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;

        // Пока не достигнут конец одной из строк
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }
        // Добавляем оставшиеся символы из word1, если есть
        while (i < word1.length()) {
            result.append(word1.charAt(i++));
        }

        // Добавляем оставшиеся символы из word2, если есть
        while (j < word2.length()) {
            result.append(word2.charAt(j++));
        }
        return result.toString();
    }

}
