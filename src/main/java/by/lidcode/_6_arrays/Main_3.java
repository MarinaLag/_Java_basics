package by.lidcode._6_arrays;

public class Main_3 {
    public static void main(String[] args) {
        // найти количество элементов, которые больше соседей
        int[] arr = {2, 5, 2};
        int[] arr1 = {1, 5, 2, 4, 2};

        System.out.println(count(arr));  // количество = 1 - это 5
        System.out.println(count(arr1)); // количество = 2 - это 5 и 4
    }

    public static int count(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
