package by.lidcode._3_стримы.liveCoding_3.поОбъектам;

import java.util.List;

class Department {
    String name;
    List<Employee> employees;

    public Department() {
    }

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Department{");
        sb.append("name='").append(name).append('\'');
        sb.append(", employees=").append(employees);
        sb.append('}');
        return sb.toString();
    }
}
