package by.lidcode._2_инициализация_И_кодревью.scopy;

public class Main_2 {
    public static void main(String[] args) {
        int a = 10; // локальная переменная a
        if (a > 5) {
            int b = 5; // локальная переменная b (внутри блока if)
            System.out.println("b: " + b);
        }
        // System.out.println(b); // Эта строка вызовет ошибку компиляции
    }
}
