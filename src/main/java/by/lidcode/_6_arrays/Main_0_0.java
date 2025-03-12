package by.lidcode._6_arrays;

public class Main_0_0 {
    public static void main(String[] args) {
        // разница 0 и null

        int [] arr = new  int[0];
        int [] arr1 = null;

        int lenghtArr = arr.length;
        System.out.println(lenghtArr); // 0
        // int [] arr = new  int[0]; фактически создаст объект массива (и, следовательно, займёт память
     //   System.out.println("значение" + arr[0]);
        //ArrayIndexOutOfBoundsException: индекс 0 выходит за пределы длины 00

        int lengthArr1 = arr1.length;
        System.out.println(lengthArr1); //NullPointerException:
        // Не удается прочитать длину массива, поскольку значение "arr1" равно null
        //  int [] arr1 = null; (null) не создаёт объект.

    }
}
