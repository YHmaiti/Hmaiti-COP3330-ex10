/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program creates a simple self-checkout system.
// Prompts for the prices and quantities of three items.
// Calculates the subtotal of the items. Then calculates the tax using
// a tax rate of 5.5%. Prints out the line items with the quantity
// and total, and then print out the subtotal, tax amount, and total.

package org.example;

import java.util.*;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // create arrays to store the prices and the quantity of each item
        float[] price = new float[3];
        int[] numItem = new int[3];

        // for loop to gather the price and quantity of each corresponding item
        // and store it in the corresponding array while doing numerical conversions
        // from the scanned strings
        for (int i = 0; i < 3 ; i++) {

            System.out.print("Enter the price of item " + (i+1) + ": ");
            price[i] = Float.valueOf(scanner.nextLine());
            System.out.print("Enter the quantity of item " + (i+1) + ": ");
            numItem[i] = Integer.valueOf(scanner.nextLine());

        }

        // create a variable to hold the subtotal
        float subTotal = 0;

        // calculate the subtotal
        for (int j = 0; j < 3; j++) {

            subTotal += (price[j] * numItem[j]) ;

        }

        // calculate the tax and final total and store them in respective variables
        float tax = (float) (subTotal * 5.5)/100;
        float total = tax + subTotal;

        // create strings the store the output as expected from the assignments
        String SubTotal = "Subtotal: $" + subTotal;
        String Tax = "Tax: $" + tax;
        String TOTAL = "Total: $" + total;

        // print the output as expected from the assignment
        System.out.println(SubTotal);
        System.out.println(Tax);
        System.out.print(TOTAL);

    }

}