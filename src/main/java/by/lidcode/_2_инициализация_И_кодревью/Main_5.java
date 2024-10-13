package by.lidcode._2_инициализация_И_кодревью;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main_5 {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        persons.add(new Person("John", 28));
        persons.add(new Person("Mark", 31));
        persons.add(new Person("Mark", 31));
        System.out.println(persons.size());
    }

    static class Person {

        public String name;
        public int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }
}

