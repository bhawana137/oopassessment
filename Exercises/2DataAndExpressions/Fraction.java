package week2;

import java.util.Scanner;
public class Fraction {
    public static void main(String[] args) {
        int numerator, denominator;
        double decimalEquivalent;
        Scanner scan = new Scanner(System.in);

        // Ask the user to enter the numerator and denominator
        System.out.print("Enter the numerator: ");
        numerator = scan.nextInt();  // Read the numerator

        System.out.print("Enter the denominator: ");
        denominator = scan.nextInt();  // Read the denominator

        // Check if the denominator is not zero
        if (denominator != 0) {
            // Calculate the decimal equivalent
            decimalEquivalent = (double) numerator / denominator;
            // Display the result
            System.out.println("The decimal equivalent of " + numerator + "/" + denominator + " is: " + decimalEquivalent);
        } else {
            // If the denominator is zero, show an error
            System.out.println("Error: Denominator cannot be zero.");
        }

        scan.close();  
    }
}

