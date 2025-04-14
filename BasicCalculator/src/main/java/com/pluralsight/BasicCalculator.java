package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        //create an instance of the scanner so we can use it to get user input
 Scanner myScanner = new Scanner(System.in);

   System.out.println("enter the first number");

   // stop the application and wait for the user to answer the above question and hit enter

       int firstNumber = myScanner.nextInt();

       //ask the user for teh second number
        System.out.println("Enter the second number: ");

        //stop the application and wait for the user to answer the above question and hit enter
        int secondNumber = myScanner.nextInt();

        //eats up the extra LF (the press of enter) from the above scanner nextInt()
        myScanner.nextLine();

        //display menu for type of calculation
        System.out.println("Possible calculations: ");
        System.out.println("   (A)dd  ");
        System.out.println("   (S)ubtract ");
        System.out.println("   (M)ultiply ");
        System.out.println("   (D)ivide   ");
        System.out.println(" Please select an option:  ");

        String userChoice = myScanner.nextLine();

        //lets figure out the product of the two numbers multiplied together
        int product = firstNumber + secondNumber;
        System.out.print(firstNumber + " * " + secondNumber + "  = + product");
    }

}
