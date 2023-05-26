package ДЗ_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop(4, 1, "win10", "black");
        Laptop lap2 = new Laptop(4, 1, "linux", "black");
        Laptop lap3 = new Laptop(4, 1, "win10", "red");
        Laptop lap4 = new Laptop(8, 2, "win10", "red");
        Laptop lap5 = new Laptop(8, 2, "linux", "white");
        Laptop lap6 = new Laptop(16, 4, "win11", "white");

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


       System.out.println("Чтобы произвести выборку по объму RAM нажмите - 1, по обёму HDD - 2, по типу ОС - 3, по цвету 4");
        Scanner scanner = new Scanner(System.in);
        int userChoise = scanner.nextInt();
        if (userChoise == 1) {
            System.out.println("Введите минимальный объем RAM 4, 8 или 16");
            Scanner scanner1 = new Scanner(System.in);
            int userChoise1 = scanner.nextInt();
            for (Laptop laptop: laptops){
                if (laptop.getRam() >= userChoise1){
                    System.out.println(laptop);

                }
                
            }
        } 
           
        
        if (userChoise == 2) {
            System.out.println("Введите минимальный объем HDD gb 1, 2 или 4");
            Scanner scanner2 = new Scanner(System.in);
            int userChoise2 = scanner2.nextInt();

            for (Laptop laptop: laptops){
                if (laptop.getHdd() >= userChoise2){
                    System.out.println(laptop);

                }
                
            }
        } 
        
        if (userChoise == 3) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Введите тип ОС win10, win11  или linux ");
            
            String userChoise3 = scanner3.nextLine();

            for (Laptop laptop: laptops){
                if (laptop.getOs().equals(userChoise3) ){ //минимальное значение этого параметра не имеет смыслы
                    System.out.println(laptop);

                }
            }
        }  

        if (userChoise == 4) {
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Введите тип ОС black, white  или red ");
            
            String userChoise4 = scanner4.nextLine();
            //System.out.println(userChoise4);
            for (Laptop laptop: laptops){
                if (laptop.getColor().equals(userChoise4) ){ //минимальное значение этого параметра не имеет смыслы
                    System.out.println(laptop);

                }
            }
        } 
        else {
            System.out.println("Неверный ввод");
        } 
       
 //       for (Cat cat: cats){
 //           if (cat.getAge() == 8){
   //             System.out.println(cat);
  //          }
   //     }
   // man1.equals(man2)
        
    }
}
    