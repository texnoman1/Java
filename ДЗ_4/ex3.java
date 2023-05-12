/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор */

package ДЗ_4;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class ex3 {
    public static void main(String[] args) {
       
            
        List<Integer> numbers = new LinkedList<>();
            numbers.add(5);
            numbers.add(7);
            numbers.add(100);
            numbers.add(3);
            
            int sum = 0;
for (Integer sumItem : numbers) {
  sum += sumItem;
}
            
            System.out.println("Сумма всех элементов списка: " + sum);
            
              
    }
}
