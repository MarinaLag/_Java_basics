package by.tasks.алгоритмы;

public class Main_10 {
    public static void main(String[] args) {
        // написать код который выводит числа от 0 до 1000, которые делятся на 3 ,
        // но не делятся на 5 , и сумма цифр в которых меньше десяти

        method();
    }

    public static void method() {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 != 0 && sumOfDigits(i) < 10){
                System.out.println(i);
            }
        }
    }

    // Метод для вычисления суммы цифр числа
    public static int sumOfDigits(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10; // Добавляем последнюю цифру
            i /= 10;       // Удаляем последнюю цифру
        }
        return sum;
    }

}
