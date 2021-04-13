package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

public class Menu {
    //instance variables
    private final ArrayList<String> appetizers = new ArrayList<String>();
    private final ArrayList<String> mainDishes = new ArrayList<String>();

    //default constructor
    public Menu(){
        appetizers.add("OShrimp");
        appetizers.add("Curly Fries");
        appetizers.add("Pickled Fries");
        mainDishes.add("Veggie Burger");
        mainDishes.add("Italian Sandwich");
        mainDishes.add("Italian Salad");
    }

    public void addAppetizer(String appetizer){
        this.appetizers.add(appetizer);
    }

    public void addMainDish(String mainDish) {
        this.mainDishes.add(mainDish);
    }

    public String getAppetizers(){
        return appetizers.toString()
                .replace("[", "")
                .replace("]", "")
                .trim();
    }

    public String getMainDishes(){
        return mainDishes.toString()
                .replace("[", "")
                .replace("]", "")
                .trim();
    }

    public void printFullMenu(){
        String mainDishList = getMainDishes();
        String appetizerList = getAppetizers();
        System.out.println("Appetizers: " + appetizerList +"\n"+ "Main Dishes: " + mainDishList);
    }
}
