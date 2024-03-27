package by._java_EE._6_thread._1_thread;

public class Main {
    public static void main(String[] args) {
       Thread t = Thread.currentThread();
        System.out.println(t.getName());
       System.out.println(t);

        System.out.println("Main thread started...");
        new JThread("JThread").start();
        System.out.println("Main thread finished...");

    }
}
