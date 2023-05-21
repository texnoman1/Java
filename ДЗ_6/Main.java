package ДЗ_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop(4, 1, "win10", "черный");
        Laptop lap2 = new Laptop(4, 1, "linux", "черный");
        Laptop lap3 = new Laptop(4, 1, "win10", "красный");
        Laptop lap4 = new Laptop(8, 2, "win10", "черный");
        Laptop lap5 = new Laptop(8, 2, "linux", "черный");
        Laptop lap6 = new Laptop(16, 4, "win11", ",белый");

        System.out.println(lap1);

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(lap1);
        laptops.add(lap2);
        laptops.add(lap3);
        laptops.add(lap4);
        laptops.add(lap5);
        laptops.add(lap6);

        for (Laptop laptop: laptops){
           System.out.println(laptop);
       }
 //       for (Cat cat: cats){
 //           if (cat.getAge() == 8){
   //             System.out.println(cat);
  //          }
   //     }
        
    }
}
