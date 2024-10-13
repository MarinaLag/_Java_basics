package by.lidcode._3_стримы.liveCoding_3.поОбъектам;

public class Main {
    public static void main(String[] args) {
  /*      List<Department> departments =
                new ArrayList<>();
        departments.add(new Department("first", List.of(
                new Employee("Ivan", "Ivanov", 1000),
                new Employee("Petr", "Petrov", 2500),
                new Employee("Dmitry", "Dmitryev", 1400),
                new Employee("Ivan", "Petrov", 1200))));
        departments.add(new Department("second", List.of(
                new Employee("Sergey", "Smirnov", 1400),
                new Employee("Dmitry", "Nikonov", 2500))
        ));
*/

        ////Найти отдел в котором находится работник с минимальной зарплатой
        //departments.stream()
        //        .flatmap(dep ->dep.getEmp().steam()).min(Comporator.comparing(Emp::GetSalary)).orElse(null)
        //
        ////Получить списки работников сгруппированые по зарплате
        // .flatmap(dep ->dep.getEmp().steam()).collect(Collectors.grouningBy(Emp::GetSalary)
        //
        ////Получить список работников всех отделов, отсортированный по имени, фамилии, зарплате
        //departments.stream()
        //        .flatmap(dep ->dep.getEmp().steam()).sorted(Comporator.comparing(Emp::GetSalary).thenCompering(Emp::getName).thenComp (Emp::fa).toList
    }
}
