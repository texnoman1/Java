/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */

package ДЗ_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ex1{
    
       // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    
    
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 12367987, bookPhone);
        addNumber("Ivanov", 12348998, bookPhone);
        addNumber("Petrov", 5465859, bookPhone);
        addNumber("Sidorov", 8956477, bookPhone);
        addNumber("Ivanov", 12356233, bookPhone);
        addNumber("Petrov", 787897, bookPhone);
        bookPhone.forEach((key, value) -> System.out.println(key + " " + value)); //
        
       }
    }