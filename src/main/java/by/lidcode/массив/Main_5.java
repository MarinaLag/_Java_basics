package by.lidcode.массив;

public class Main_5 {
    public static void main(String[] args) {
        // найти максим среднюю сумму arr состоящую из подмассива из 4 элементов
        // ответ 12+(-5) + (-6) +50 =12,75
        int[] arr = {1, 12, -5, -6, 50, 3}; // основной массив
        int k = 4; // подмассив

        System.out.println(maxArray(arr, k));
    }
    public static double maxArray(int[] arr, int k) {
        if (arr.length < k) {
            return 0; // Если массив меньше k, возвращаем 0
        }
        double max = Double.NEGATIVE_INFINITY;
        double sum = 0.0;

        // Считаем сумму первых k элементов
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        for (int i=4; i<arr.length; i++){
            sum += arr[i] - arr[i - k];
            if(max<sum){
                max=sum;
            }
        }
        return max/k;
    }
}
