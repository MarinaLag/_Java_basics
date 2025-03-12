package by.lidcode_1;

public class Main_3_divisorString {
    public static void main(String[] args) {
        // является ли строка делителем
        String str1 = "ABCABC";
        String str2 = "ABC";
     //   System.out.println("1 " + divisorOfString(str1, str2)); // ABC
        System.out.println("1 " + divisorOfString3(str1, str2)); // ABC

        String str3 = "LEET";
        String str4 = "CODE";
      //  System.out.println("2 " + divisorOfString(str3, str4)); // ""
        System.out.println("2 " + divisorOfString3(str3, str4)); // ""

        String str5 = "ABABAB";
        String str6 = "ABAB";
     //   System.out.println("3 " + divisorOfString1(str5, str6)); // "AB"
        System.out.println("3 " + divisorOfString3(str5, str6)); // "AB"

    }

    public static String divisorOfString(String str1, String str2) {
        // Проверяем, делится ли длина str1 на длину str2
//       if (str1.length() % str2.length() != 0) {
//           return "no divisor"; // ABC и AB
//       }
        // Вычисляем количество повторений str2
        int repeatCount = str1.length() / str2.length();  //2

        // Формируем строку из повторений str2
        StringBuilder repeatedStr = new StringBuilder();
        for (int i = 0; i < repeatCount - 1; i++) {
            repeatedStr.append(str2);
        }
        return repeatedStr.toString();
    }

    public static String divisorOfString1(String str1, String str2) {
        int repeatCount = str2.length() / 2;//2

        StringBuilder repeatedStr = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            repeatedStr.append(str2.charAt(i));
        }
        return repeatedStr.toString();
    }

    public static String divisorOfString3(String str1, String str2) {
        StringBuilder repeatedStr = new StringBuilder();
        int repeatCount = 0;
        // Вычисляем количество повторений str2
        repeatCount = str1.length() / str2.length(); //2 1
        if (str1.length() % str2.length() == 0) {
            for (int i = 0; i < repeatCount-1; i++) {
                repeatedStr.append(str2);
            }
        }else {

        }


//        for (int i = 0; i < repeatCount; i++) {
//            repeatedStr.append(str2.charAt(i));
//        }
        return repeatedStr.toString();
    }
}
