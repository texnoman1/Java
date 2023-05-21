package ДЗ_6;

public class Laptop {
    /*
     * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

Работу сдать как обычно ссылкой на гит репозиторий

P.S. Частые ошибки смотри в конце семинара

     */

     private Integer ram;
     private Integer hdd;
     private String os;
     private String color;

     public Laptop(Integer ram, Integer hdd,  String os, String color) {
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.color = color;        
    }

    public Integer getRam() {
        return ram;
    }
    public Integer getHdd() {
        return hdd;
    }
    public String getOs() {
        return os;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "RAM гб: " + ram + ", HDD гб: " + hdd + ", ОС: " + os + ", цвет: " + color;
    }

}
