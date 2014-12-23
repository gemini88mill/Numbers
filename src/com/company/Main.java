package com.company;

import java.util.Scanner;

/**
 * @Author Raphael Miller
 * Next Prime
 *
 * Next Prime Number – Have the program find prime numbers until
 * the user chooses to stop the asking for the next one.
 */

public class Main {


    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {
	// Next prime starts here
        Scanner scan = new Scanner(System.in);
        int prime = 0;

        //while loop that stops when method "" returns -1
        while (prime != -1){ //exit code -1
            prime = scan.nextInt(); //simple i/o reader 
            boolean proof = primeEquation(prime);
        System.out.println(proof);
        }

        System.out.println("---Program Terminated---");
    }

    /**
     * Method primeEquation()
     * used to calculate prime numbers until limit or
     * until -1 is introduced.
     *
     * @param prime
     */
    private static boolean primeEquation(int prime) {

        boolean proof = true;


        //for loop that counts down and checks if numbers below potenial prime numbers are
        //actually prime if true prime boolean value is changed to true.
        for (int x = (prime - 1); x >= 2; x--){
            if (prime % x == 0){
                proof = false;
                System.out.print(x + " ");
            }
        }

        //prime++;
        return proof;
    }
}
