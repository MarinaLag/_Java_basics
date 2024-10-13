package by.lidcode._2_инициализация_И_кодревью.scopy;

public class ScopeExample_2 {
    int x = 5; // переменная обычная экземпляра

    public void method() {
        int x = 10; // локальная переменная с тем же именем
        System.out.println("Локальная x: " + x); // выводит 10
    }

    public void display() {
        System.out.println("Экземпляр x: " + x); // выводит 5
    }

    public static void main(String[] args) {
        ScopeExample_2 example = new ScopeExample_2();
        example.method(); //10
        example.display(); //5
//Локальная переменная x в методе method скрывает переменную экземпляра x.
    }
}
