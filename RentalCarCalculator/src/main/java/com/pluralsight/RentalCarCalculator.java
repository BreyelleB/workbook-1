package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {



        //we need to ask user for a date and store it as a string
        System.out.println("What is the pickup date?");
        String date = theScanner.nextLine();

        //ask the user the number of days for the rental
        //store that as an int
        System.out.println("How many days are you renting for?");
        int numOfDays = theScanner.nextInt();

        //fix the weird carriage return from the above scanner
        theScanner.nextLine();

        //do you want an electronic toll tag 3.95 upcharge per day
        //store answer as a string
        System.out.println("Toll tag?) (3.95/per day) (y/n");
        String tollTag = theScanner.nextLine();

        //do you want a gps? 2.95 per day
        System.out.println("GPS? (2.95/per day) (y/n)");
        String gps = theScanner.nextLine();




        //do you want a roadside assistance 3.95 per day
        System.out.println("Roadside Assistance? (3.95/per day) (y/n)");
        String roadsideAssistance = theScanner.nextLine();

        //we need to ask their age
        System.out.println("How old are you?");
        int age = theScanner.nextInt();

        //calculate the base rental price 29.99 per day
        double basePrice = 29.99 * numOfDays;

        //start options cost at 0, they dont have an options cost unless they pick options
        double optionsCost = 0;
         //figure out the options cost (gps + toll + roadside assistance)
        if(tollTag.equalsIgnoreCase("y")){
            optionsCost += 3.95;

        }

        if(gps.equalsIgnoreCase("y")){
            optionsCost += 2.95;
        }
        if(roadsideAssistance.equalsIgnoreCase("y")){
            optionsCost += 3.95;

        }

        //generate total options cost
        optionsCost *= numOfDays;

       double subTotal = basePrice + optionsCost;

        double surcharge = 0;
        if(age < 25){
            surcharge = subTotal * .3;


        }
        double total = subTotal + surcharge;

        //display some information
        //basic car rental price
        //options cost
        //underage driver surcharge
        //total cost
        System.out.printf("Base Rental Cost $%.2f%n", basePrice);
        System.out.printf("Base Rental Cost $%.2f%n", optionsCost);
        System.out.printf("Base Rental Cost $%.2f%n", surcharge);
        System.out.printf("Base Rental Cost $%.2f", total);
    }
}
