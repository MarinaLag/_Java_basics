package by.lidcode._2_инициализация_И_кодревью.scopy.scopy_1;

public class Main {
    public static void main(String[] args) {
        //Создать класс, который будет использоваться как прототип.
        // Каждое обращение к этому классу должно создавать новый экземпляр.
        Prototype prototype = new Prototype();

        Prototype prototype1 = prototype.clone();
        Prototype prototype2 = prototype.clone();

        prototype1.showMessage();
        prototype2.showMessage();

        System.out.println(prototype1 == prototype2); // false, разные экземпляры
    }
}
