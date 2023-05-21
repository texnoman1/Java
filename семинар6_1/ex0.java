package семинар6_1;
import java.util.*;

public class ex0 {
    public static void main(String[] args){
        /*
        1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
        2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
        3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
         */
        Integer[] arr = new Integer[]{3, 2, 6, 1, 2, 4, 5, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set1); // сортировка по возрастанию
        System.out.println(set2); // запоминает исходный порядок
        System.out.println(set3); // сортировка по возрастанию
    }
}
