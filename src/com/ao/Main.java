package com.ao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Tell the java.util.Scanner class to read from the System.in stream (standard input)
        Scanner reader = new Scanner(System.in);

        // Print out prompt
        System.out.println("Enter a number: ");

        // Scans the next token of the input as an int. If you are going to be working with money, you are going to want to use BigDecimal instead of floats.
        // (google floating point math to understand why)
        int x = reader.nextInt();
        System.out.println("Enter another number: ");
        int y = reader.nextInt();

        // Print the result
        System.out.println("The sum of the two numbers is: " + (x+y));


    }
}
/*
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter principle: ");
        int x = reader.nextInt();
        System.out.println("Enter your ending value: ");
        int y = reader.nextInt();
        System.out.println("Enter how many years your loan is over: ");
        int z = reader.nextInt();
        
        System.out.println("The rate of your return is: " + (Math.pow((y / x), z)-1));
    }
}
here is what I ended with. Using the equation R = (E/B) ^(1/N) - 1. B is the begining value E is the ending and the N is
the number of years the loan was over. I did get it to compile and work just fine. is there anything I should have changed in it?
