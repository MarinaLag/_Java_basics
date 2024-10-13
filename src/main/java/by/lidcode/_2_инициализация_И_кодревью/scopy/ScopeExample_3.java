package by.lidcode._2_инициализация_И_кодревью.scopy;

public class ScopeExample_3 {
    public static void main(String[] args) {
        int x = 1; // локальная переменная
        if (true) {
            int y = 2; // локальная переменная в блоке if
            System.out.println("x: " + x + ", y: " + y); // доступ к обеим переменным
        }
        // System.out.println(y); // Эта строка вызовет ошибку компиляции
    }
}
