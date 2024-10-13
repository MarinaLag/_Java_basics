package by.lidcode._3_стримы.liveCoding_3.task_4_set;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Вернуть список user у которых есть хоть одна группа, которая начинается на "x"

        // Создаем группы
        Groups group1 = new Groups("XGroup A", "Description A");
        Groups group2 = new Groups("Group B", "Description B");

        // Создаем список групп
        List<Groups> groupsList = new ArrayList<>();
        groupsList.add(group1);
        groupsList.add(group2);

        // Создаем пользователей
        User user1 = new User("Tom", 20, groupsList);
        User user2 = new User("Alice", 25, groupsList);

        // Создаем список пользователей
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        Stream<User> userStream = userList.stream();
        System.out.println(getUsers(userStream));
    }

    public static List<User> getUsers(Stream<User> userStream) {
        return userStream.filter(user -> user.getGroups().stream()
                        .anyMatch(group -> group.getName().startsWith("X")))
                        .toList();

    }

}
