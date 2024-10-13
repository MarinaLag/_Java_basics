package by.lidcode._3_стримы.liveCoding_3.task_4_set;

import java.util.List;

public class User {
    private String name;
    private Integer age;
    private List<Groups> groups;

    public User(String name, Integer age, List<Groups> groups) {
        this.name = name;
        this.age = age;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Groups> getGroups() {
        return groups;
    }

    public void setGroups(List<Groups> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
