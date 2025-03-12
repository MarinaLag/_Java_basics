package by.lidcode._6_arrays;

import java.lang.reflect.Array;

public class Main_0_3 {
    public static void main(String[] args) {
        // количество элементов в матрице

        //Нет, в Java нет встроенной функции для этого,
        // так как массив массивов (массивов (массивов ...))
        // сам по себе не является языковой конструкцией.
        // Массив — это конструкция, но массив массивов —
        // это просто массив объектов (которые могут быть,
        // но не обязательно должны быть массивами).
        // Обозначение Object[][] просто обеспечивает безопасность типов для многомерных массивов.

        // Универсальное решение, в котором производительность
        // не является проблемой, подсчитывающее все элементы, не являющиеся массивами,
        // для массивов произвольной размерности с помощью рекурсии

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(size(matrix));
        System.out.println("===================");

        Object[] array = {
                "1",
                new String[]{
                        "2", "3", "4"
                },
                new int[][]{
                        {5},
                        {6, 7},
                        {8, 9, 10}
                }
        };
        System.out.println(size(array));
        System.out.println("====================");

        String literal = "literal";
        System.out.println(size(literal));
    
    }

    public static int size(Object object) {
        if (!object.getClass().isArray()) {
            return 1;
        }

        int size = 0;
        for (int i = 0; i < Array.getLength(object); i++) {
            size += size(Array.get(object, i));
        }
        return size;
    }
}
