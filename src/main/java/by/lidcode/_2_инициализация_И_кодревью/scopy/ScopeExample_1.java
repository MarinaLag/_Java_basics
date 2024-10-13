package by.lidcode._2_инициализация_И_кодревью.scopy;

public class ScopeExample_1 {
    static int staticVar = 30; // статическая переменная

    public static void display() {
        System.out.println("staticVar: " + staticVar);
    }

    public static void main(String[] args) {
        display();
    }
    //Программа выведет staticVar: 30. Статическая переменная доступна из статических методов.
}
