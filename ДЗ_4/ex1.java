/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам. */


package ДЗ_4;
import java.util.LinkedList;
import java.util.Iterator;

public class ex1 {
    public static void main(String[] args) {
       String str1 = new String("a");
       String str2 = new String("b");
       String str3 = new String("c");
       String str4 = new String("d");

       LinkedList<String> list = new LinkedList<>();
       list.add(str1);
       list.add(str2);
       list.add(str3);
       list.add(str4);

       LinkedList<String> list1 = new LinkedList<>();

       System.out.println(list);

       Iterator<String> iterator = list.descendingIterator();
       while (iterator.hasNext()) 
        {
            list1.add(iterator.next());
            //System.out.print(iterator.next());
        }
        System.out.print(list1);
    }
}
