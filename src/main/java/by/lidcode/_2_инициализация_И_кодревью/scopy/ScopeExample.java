package by.lidcode._2_инициализация_И_кодревью.scopy;

public class ScopeExample {
    int  instanceVar = 20; // переменная обычная экземпляра

    public  void display() {
        System.out.println("instanceVar: " + instanceVar);
        // System.out.println("kkk");
    }

    public static void main(String[] args) {
        ScopeExample example = new ScopeExample();
        example.display(); // 20
        //Переменная экземпляра доступна в любых методах этого класса.

        // если будет static - ошибка

       // display();
    }
}
