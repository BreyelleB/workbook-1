package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

 //Getting user input on sandwich size
        Scanner sandSize = new Scanner(System.in);
        System.out.println("do you want a regular or a large");
        String sandwichSize  = sandSize.nextLine();
        double price;
        if (sandwichSize.equals("large")){
        // sandwichSize equals 8.95
            price = 8.95;
        } else {
            price = 5.45;
        }
         System.out.println(price);

   //Getting user input on student age
    Scanner howOld = new Scanner(System.in);
    System.out.println("may I ask, how old are you");
    int studentAge = howOld.nextInt();
    double total;
    if (studentAge <= 17){
        total = price - (price *.1);
        System.out.println("you get a discount today" + total);
    }
    else if(studentAge >=65){
        total = price - (price *.2);
        System.out.println("we will add the senior discount to your order" + total);

    } else {
        total = price;
        System.out.println("here is your total" + total);
    }

    }

}
