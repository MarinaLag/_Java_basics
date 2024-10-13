package by.lidcode._2_инициализация_И_кодревью;

public class Main_2 {
    public static void main(String[] args) {

    }
    void test() {
        String s1 = "s1";
        String s2 = "s2";

        s1 += "s1";
        plusS2(s2);  // это метод, С рАБОТАЕТ КАК ЧЕРНЫЙ ЯЩИК

        System.out.println(s1);  // s1s1
        System.out.println(s2);   // s2
    }

    void plusS2(String s2) {
        s2 += "s2";
    }

}
