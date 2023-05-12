//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. 
//Collections.max()

import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class hw3_2 {
    public static void main(String[] args)
     {
        
            // создаем массив целых чисел
            Integer [] array = {40, 1, 2, 25, 4, 5, 100};
    
            // создаем список из массива
            ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));

    
            Collections.sort(list);

            System.out.println("min mumber = " + list.get(0));
            System.out.println("max mumber = " + list.get(list.size() - 1));

            double avg = 0;
            for (int index = 0; index < array.length; index++) {
                avg = avg + array[index];

            }
            avg = avg / array.length;

            System.out.println("avg = " + avg);

        //System.out.println(Collections.max(array));
       // System.out.println(Collections.min(array));



    }
}
