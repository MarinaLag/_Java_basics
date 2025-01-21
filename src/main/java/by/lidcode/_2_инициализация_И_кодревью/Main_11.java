package by.lidcode._2_инициализация_И_кодревью;


import java.util.ArrayList;
import java.util.List;

public class Main_11 {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);

        ints.remove(4);

//        for (Integer i : ints) {
//            if (i == 4) {
//                ints.remove(i);
//            }
//        }
        System.out.println(ints);// 123

    }
}
