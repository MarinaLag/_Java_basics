package by.lidcode._14_функциональные_интерфейсы;

@FunctionalInterface
public interface Test {
    void print();

    static void printName(String name) {
        System.out.println("Марина");
    }

}
