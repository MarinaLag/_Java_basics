package by.lidcode._2_инициализация_И_кодревью.scopy;

public class Main_1 {
    public static void main(String[] args) {
        // что получим
        int a = 4;
        Integer b = 9;

        inc(a);
        b = inc(b);

        System.out.println(a); //4
        System.out.println(b); //10
    }

    public static void inc(int a) {
        a++;
    }

    public static Integer inc(Integer a) {
        a++;
        return a;
    }
}
