package by.lidcode._2_инициализация_И_кодревью.scopy.scopy_1;

public class Prototype {
    public Prototype() {
        // Конструктор
    }

    public Prototype clone() {
        return new Prototype(); // Возвращаем новый экземпляр
    }

    public void showMessage() {
        System.out.println("Hello from Prototype!");
    }
}
