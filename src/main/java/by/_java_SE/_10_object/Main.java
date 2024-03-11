package by._java_SE._10_object;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Tom", 25);
        System.out.println(student.getClass());
        System.out.println("Main.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("student = " + student);
        System.out.println("student1 = " + student1);



    }
}
