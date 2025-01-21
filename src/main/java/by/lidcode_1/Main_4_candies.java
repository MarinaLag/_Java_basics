package by.lidcode_1;

import java.util.ArrayList;
import java.util.List;

public class Main_4_candies {
    public static void main(String[] args) {
        // [true,true,true,false,true]
        //- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
        //- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
        //- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
        //- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
        //- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
        System.out.println(kidsWithCandies1(candies,extraCandies));

        //[true,false,false,false,false]
        int[] candies1 = {4,2,1,1,2};
        int extraCandies1 = 1;
        System.out.println(kidsWithCandies(candies1, extraCandies1));
        System.out.println(kidsWithCandies1(candies1,extraCandies1));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];

        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
    public static List<Boolean> kidsWithCandies1(int[] candies, int extraCandies) {
        // Находим максимальное количество конфет у детей
        int maxCandies = 0;
        for (int i : candies) {
            if (i > maxCandies) {
                maxCandies = i;
            }
        }
        // Создаем лист для результата
        List<Boolean> result = new ArrayList<>();
        // Заполняем лист result
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
