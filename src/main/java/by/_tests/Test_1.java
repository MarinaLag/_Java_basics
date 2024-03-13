package by._tests;

public class Test_1 {
    public static void main(String[] args) {
        System.out.println("1 ");
        synchronized (args){
            System.out.println("2 ");
            try {
                args.wait();
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
        System.out.println("3 ");
    }
}
