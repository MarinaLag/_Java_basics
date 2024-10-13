package by.lidcode._2_инициализация_И_кодревью.task_1;

public class Main {
    public static void main(String[] args) {
        new A();  // 2
      // new B();

        // вызываем конструктор B а он вызовет А
        //в конструкторе А вызоветля метод из В
        // попросит вывести длинну строки, но переменная еще не проиницализировалась
        // => NullPointerException
    }
}
