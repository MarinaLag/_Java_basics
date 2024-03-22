package by._java_EE._5_lambda;

import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Operationable operationable0 = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int result1 = operationable0.calculate(1, 30);
        System.out.println(result1);


        Operationable operationable;
        operationable = (x, y) -> x + y;
        int result = operationable.calculate(5, 10);
        System.out.println(result);

        Operationable operationable1 = (x,y) ->x-y;
        System.out.println(operationable1.calculate(20,10));
        Operationable operationable2 = (x,y) -> x*y;
        System.out.println(operationable2.calculate(30,2));
        Operationable operationable3 = (x,y) -> x/y;
        System.out.println(operationable3.calculate(30,2));

        System.out.println("-------------------------");
        Printable printable = s -> System.out.println(s);
        printable.print("Hello");


    }
}
