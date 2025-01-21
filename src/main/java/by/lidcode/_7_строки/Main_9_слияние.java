package by.lidcode._7_строки;

public class Main_9_слияние {
    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqr";
        String res = mergeAlternately(word1, word2);
        System.out.println(res);
        String res1 = mergeAlternately1(word1, word2);
        System.out.println(res1);

        System.out.println("=========================");
        String word11 = "ab";
        String word22 = "pqrs";
        String res2 = mergeAlternately2(word11, word22);
        System.out.println(res2);


    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i<word1.length() && j<word2.length()){
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }
        return result.toString(); // преобразуем в строку
    }
    public static String mergeAlternately1(String word1, String word2){
         String res ="";
       //  int max = word1.length()+word2.length();
        int maxLength = Math.max(word1.length(), word2.length());

        for (int i=0; i<maxLength; i++){
           if(i<word1.length()){
               res+=word1.charAt(i);
           }
           if(i<word2.length()){
               res+=word2.charAt(i);
           }
        }
        return res;
    }
    public static String mergeAlternately2(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;

        // Пока не достигнут конец одной из строк
        while (i<word1.length() && j<word2.length()){
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
