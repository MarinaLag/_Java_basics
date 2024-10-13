package by.lidcode._2_инициализация_И_кодревью.task_4;

import java.util.HashSet;
import java.util.Set;

public class Main_1 {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        persons.add(new Person("John", 28));
        persons.add(new Person("Mark", 31));
        persons.add(new Person("Mark", 31));
        System.out.println(persons.size());



         // 1 если в классе Person переопределен метод equals()
        //  тогда = 2

        // если equals не переопределен
        //  тогда = 3
        // т.к. по умолчанию сравнивает ссылки
    }
}
