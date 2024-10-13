package by.lidcode._2_инициализация_И_кодревью.task_3;

public class A {
    void callBoth() {
        f1();
        f2();
    }

    private void f1() { // !!!!!!!! private!!!!!!!!!!!!!
        System.out.println("Af1");
    }

    protected void f2() { // !!!!!!!! protected!!!!!!!!!!!!!
        System.out.println("Af2");
    }

}
