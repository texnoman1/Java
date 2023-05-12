/*Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

package ДЗ_4;

import java.util.*;

public class ex2_1 {
    public static void main(String[] args) {
        
            LinkedList<Integer> list = new LinkedList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            System.out.println(list);

            enqueue(list, 345) ;
            System.out.println(list); //добавили элемент в конец
    
            System.out.println(dequeue(list)); // удалили первый элемент
            System.out.println(list);
    
            System.out.println(first(list)); // вывели первый элемент
            System.out.println(list); 

            
        }
    
        public static int enqueue(LinkedList<Integer> list, int num) {// помещает элемент в конец очереди
            list.addLast(num);
            return num;
        }
    
        public static int dequeue(LinkedList<Integer> list) { // возвращает первый элемент из очереди и удаляет его
            int num = list.get(0);
            list.remove(0);
            return num;
        }
    
        public static int first(LinkedList<Integer> list) { // возвращает первый элемент из очереди, не удаляя
            int num = list.get(0);
            return num;
        }
    
        
    



    }


