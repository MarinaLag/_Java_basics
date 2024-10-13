package by.lidcode._3_стримы.liveCoding_3;

public class Main_3 {
    public static void main(String[] args) {
        ////У вас есть список заказов, где каждый заказ имеет идентификатор клиента и сумму заказа.
        ////Необходимо сгруппировать заказы по клиентам и вычислить общую сумму заказов для каждого клиента.
        //
        ///*
        //public class Order {
        //    int clientId;
        //    double amount;
        //
        //    public Order(int clientId, double amount) {
        //        this.clientId = clientId;
        //        this.amount = amount;
        //    }
        //}
        //*/
        //
        // /*       List<Order> orders = Arrays.asList(
        //                new Order(1, 100.00),
        //                new Order(2, 200.00),
        //                new Order(1, 150.00),
        //                new Order(3, 300.00)
        //        );
        //
        //        Map<Integer, Double> res = orders.stream()
        //                .collect(Collectors.groupingBy(order -> order.getClienId(), Collectors.summingDouble(or -> or.getAmount()));
        ////================================================================================
        ////Предположим, у вас есть список студентов, каждый из которых имеет уникальный идентификационный номер (ID),
        ////имя и средний балл. Необходимо создать Map, где ключом будет ID студента, а значением — его имя.
        ////================================================================================
        ///*
        //public class Student {
        //    int id;
        //    String name;
        //    double average;
        //
        //    public Student(int id, String name, double average) {
        //        this.id = id;
        //        this.name = name;
        //        this.average = average;
        //    }
        //}
        //*/
        //
        //
        //  /*      List<Student> students = Arrays.asList(
        //                new Student(1, "Алексей", 3.5),
        //                new Student(2, "Мария", 3.8),
        //                new Student(3, "Сергей", 3.9)
        //        );
        //        Map<Integer, String> res = students.stream()
        //                //Stream<Student>
        //                .collect(Collectors.toMap(student -> student.getId());
    }
}
