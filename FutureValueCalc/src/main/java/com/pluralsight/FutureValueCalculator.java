package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalculator {

    public static void main(String[] args) {

        // Create instance of scanner
        Scanner myScanner = new Scanner(System.in);

        //Ask for user info and store in variables
        System.out.println("What is your initial deposit? ");
        double initialDeposit = myScanner.nextDouble();

        System.out.println("What is your annual interest rate? ");
        double interestRate = myScanner.nextDouble();

    }

}
