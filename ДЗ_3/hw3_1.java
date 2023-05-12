// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class hw3_1 {
    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(num));

        ArrayList<Integer> result = new ArrayList<Integer>();// тк обычный массив в яве не меняет размер создаем
                                                             // динамический ArrayList и записываем в него нечетные числа

        for (int index = 0; index < num.length; index++) {
         if (num [index] % 2 != 0) {
            result.add(num [index]);
         }
            
        }
        System.out.println(result);
    }
}
