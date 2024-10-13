package by.lidcode._2_инициализация_И_кодревью.task_2;

public class Child extends Parent{
    static {
        System.out.println(3);
    }
    public Child(){
        System.out.println(4);
    }
}
