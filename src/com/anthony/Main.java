package com.anthony;

import java.util.Scanner;

public class Main {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Coffee Shop Sales Calculator Program");
        // Create variables to store information about sales
        String beverageName[] = {"coffee", "hot chocolate", "tea", "cappuccino"};
        int beverageAmount[] = new int[beverageName.length];
        double beveragePrice[] = new double[beverageAmount.length];
        double totalSales = 0;
        // Simplifies iteration
        int currentBeverage = 0;
        // Loops over the beverage array to ask for the price and amount of beverages
        // for the the while adding them to the total.
        for (String name: beverageName) {
            System.out.println("How many cups of " + name + " did you sell today?");
            beverageAmount[currentBeverage] = numberScanner.nextInt();
            System.out.println("What does a cup of " + name + " cost?");
            beveragePrice[currentBeverage] = numberScanner.nextDouble();
            double drinkSales = beverageAmount[currentBeverage] * beveragePrice[currentBeverage];
            totalSales += drinkSales;
            // Increment the current beverage number for arrays
            currentBeverage ++;
        }

        System.out.println("Total sales for the day are: $" + totalSales);


        // Close scanners
        numberScanner.close();
        stringScanner.close();
    }

}
