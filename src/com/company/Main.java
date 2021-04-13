package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        String foodItem;

        //foodItem = input.next();
        //menu.printAppetizers();
        System.out.println("Main Dishes: "+menu.getMainDishes());
        menu.addMainDish("New York Pizza");
        System.out.println();
        //menu.printMainDishes();
        menu.printFullMenu();
    }
}
