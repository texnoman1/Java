import java.util.Arrays;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него четные числа

public class ex3_1 {

    public static void main(String[] args) {
        int[] randomArray = generateArray(20, 0, 1);
        System.out.println(Arrays.toString(randomArray));
        //System.out.println(count_ones(randomArray));

        for (int i = 0; i < resultArray.length; i++) {
            int result [] = new int [];
            if (resultArray[i] % 2 == 0) {
                
            }
            
        }
        }
        
        static int[] generateArray(int size, int min_seed, int max_seed){
            int[] resultArray = new int[size];
            Random rnd = new Random();
            for (int i = 0; i < size; i++) {
                resultArray[i] = rnd.nextInt(10); //генерит от о до 1, правая граница не входит
        }
        return resultArray;
        }
        
        
}
