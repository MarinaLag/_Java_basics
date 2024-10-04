package by.tasks.stream.person;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main_1 {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();

        persons.add(new Person("Alex","2"));
        persons.add(new Person("Sergei","3"));
        persons.add(new Person("Alex","2"));

        var streamPerson =persons.stream();
      //  var streamPerson1 =persons.stream();

        // НЕ ОТРАБОТАЕТ
        System.out.println(streamPerson
                .map(Person::getName)
                .collect(Collectors.joining(", ")));  //Alex, Sergei, Alex ИЛИ Sergei, Alex, Alex

       System.out.println(streamPerson
                .map(Person::getAge)
                .collect(Collectors.toList()));   // использовать поток (stream) после его завершения

        // ОТРАБОТАЕТ
        persons.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));

        persons.stream()
                .map(Person::getAge)
                .collect(Collectors.toList());
    }
}
