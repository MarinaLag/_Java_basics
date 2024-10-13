package by.lidcode._3_стримы.liveCoding_3.employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//Дан список сотрудников с их зарплатами. Необходимо увеличить зарплату каждого сотрудника на 10%,
//если их текущая зарплата меньше 1000. Получите список имён сотрудников с увеличенной зарплатой
        List<Employee> employees = List.of(
                new Employee("Tom", 2000.0),
                new Employee("Kity", 850.0),
                new Employee("Tim", 1000.0));

        List<String> getNameEmployee = employees.stream()
                //  map(employee -> employee.getSalary() < 1000 ? employee.withUpdatedSalary(employee.getSalary() * 1.1) : employee)
                .filter(employee -> employee.getSalary() < 1000) // Фильтруем сотрудников
                .map(employee -> { // Обновляем зарплату
                    employee.setSalary(employee.getSalary() * 1.1); // Увеличиваем зарплату
                    return employee; // Возвращаем обновлённого сотрудника
                })
                .map(Employee::getName) // Получаем имена сотрудников
                .toList();

        System.out.println(getNameEmployee);
    }
}
