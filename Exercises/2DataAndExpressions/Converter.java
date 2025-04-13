/*
Computing Averages The following program reads three integers and prints the average. Fill in the blanks so that it will work correctly.
// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************


import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
       int val1, val2, val3;
       double average;
       Scanner scan = new Scanner(System.in) ;


       // get three values from user
       System.out.println("Please enter three integers and " +
                       "I will compute their average");


       ____________________________________


       ____________________________________


       ____________________________________


       //compute the average


       ____________________________________


       //print the average


       ____________________________________


    }
}
*/
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

