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
