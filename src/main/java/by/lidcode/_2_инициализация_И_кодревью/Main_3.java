package by.lidcode._2_инициализация_И_кодревью;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main_3 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);

        System.out.println(ints);

        for (Integer i : ints) {
            if (i == 4) {
                ints.remove(i);
            }
        }
        System.out.println(ints);// 123

        // Это приводит к непредсказуемому результату ТАК КАК РАЗМЕР СПИСКА МЕНЯЕТСЯ ВО ВРЕМ ПОВЕДЕНИЯ
        // И ЭТО НАРУШАЕТ ЛОГИКУ ЦИКЛА

        // РЕШЕНИЕ
        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i == 4) {
                iterator.remove();
            }
        }
        System.out.println(ints);

    }
}
