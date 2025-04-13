package week2;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        double miles, kilometers;
        Scanner scan = new Scanner(System.in);

        // Ask for miles input
        System.out.print("Enter miles: ");
        miles = scan.nextDouble();

        // Convert miles to kilometers
        kilometers = miles * 1.60935;

        // Display the result
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");

        scan.close();
    }
}

