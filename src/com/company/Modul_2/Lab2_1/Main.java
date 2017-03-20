package com.company.Modul_2.Lab2_1;

/**
 * Created by Anton on 22.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
            computers[i].setManufacturer("Comp № " + (i + 1));
            computers[i].setSerialNumber((int) (Math.random() * 1000));
            computers[i].setPrice(1000 * (i + 1));
            computers[i].setQuantityCPU(4);
            computers[i].setFrequencyCPU(3);
        }
        for (Computer c : computers) {
            System.out.println(c);
        }
        System.out.println("  ");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Увеличиваем цену компьютеров на 10 %");
        System.out.println("  ");
        for (int i = 0; i < computers.length; i++) {
            computers[i].setPrice(((computers[i].getPrice() / 100) * 10) + computers[i].getPrice());
        }
        for (Computer c : computers) {
            System.out.println(c);

        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Все поля и их значения ");
        System.out.println("  ");

        for(Computer c: computers){
            System.out.println(c);
            c.view();
        }
    }
}
