package by.lidcode._1_сравнение_создание;

public class Main_3 {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = new String("s1");
        String s3 = "s" + "1";

        System.out.println(s1 == s2); //false
        System.out.println(s2 == s3);// false
        System.out.println(s1 == s3);//true



    }
}
