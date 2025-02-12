package by.lidcode._2_инициализация_И_кодревью.scopy.scopy;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.showMessage();
        singleton2.showMessage();

        System.out.println(singleton1 == singleton2); // true, оба ссылаются на один экземпляр
    }
}
