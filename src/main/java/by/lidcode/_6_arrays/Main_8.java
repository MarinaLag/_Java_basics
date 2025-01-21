package by.lidcode._6_arrays;

public class Main_8 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 4, 7};
        System.out.println(plus(arr)); //1948

    }
    public static int plus(int[] arr) {
//        int x=0; //100
//        int num =arr.length-1;
//        for(int i=0; i< arr.length;i++){
//           x += arr[i]*Math.pow(10, num); //1000  100
//          //  System.out.println(x);
//          //  System.out.println( Math.pow(10, num));
//           num--;
//        }

        int x = 0; //100
        for (int i = 0; i < arr.length; i++) {
            x += arr[i] * Math.pow(10, arr.length - 1 - i); //1000  100
        }
        x+=1;
        return x;
    }
}
