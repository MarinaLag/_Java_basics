package by.lidcode_1;

public class Main_2_mergeInteger {
    public static void main(String[] args) {
        //int res = 142536
        int a = 123;
        int b = 4567;
        System.out.println(mergeInt(a,b));

        int  res = mergeInt(a,b);
        System.out.println(res);

    }
    public static int mergeInt (int a, int b){
        StringBuilder result = new StringBuilder();

        //В методе мы сначала преобразуем оба числа в строки
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int maxLength = Math.max(strA.length(), strB.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < strA.length()) {
                result.append(strA.charAt(i));
            }
            if (i < strB.length()) {
                result.append(strB.charAt(i));
            }
        }
        return Integer.parseInt(result.toString());
    }

}
