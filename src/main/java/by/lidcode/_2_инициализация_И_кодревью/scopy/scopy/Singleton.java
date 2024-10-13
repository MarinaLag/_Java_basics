package by.lidcode._2_инициализация_И_кодревью.scopy.scopy;

public class Singleton {
    //Создать класс, который будет реализовывать паттерн Singleton.
    // Это значит, что класс должен иметь только один экземпляр,
    // который будет использоваться во всем приложении.

    private static Singleton instance;

    private Singleton() {
        // Приватный конструктор, чтобы предотвратить создание экземпляров
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

