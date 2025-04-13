/*
Formatting Output
The following source code contains a partial program that computes the cost of buying an item at a deli. Save the program to your directory and do
the following:
Study the program to understand what it does.
Add the import statements to import the DecimalFormat and NumberFormat classes.
Add the statement to declare money to be a NumberFormat object as specified in the comment.
Add the statement to declare fmt to be a DecimalFormat object as specified in the comment.
Add the statements to print a label in the following format (the numbers in the example output are correct for input of $4.25 per pound and 41 
ounces). Use the formatting object money to print the unit price and total price and the formatting object fmt to print the weight to 2 decimal 
places.
      *****  CS Deli  *****
      
     Unit Price: $4.25 per pound
     Weight: 2.56 pounds
      
     TOTAL:  $10.89
// ********************************************************
// DeliFormat.java
//
// Computes the price of a deli item given the weight
// (in ounces) and price per pound -- prints a label, 
// nicely formatted, for the item.
//
// ********************************************************


import java.util.Scanner;




public class Deli
{
   // ---------------------------------------------------
   //  main reads in the price per pound of a deli item
   //  and number of ounces of a deli item then computes
   //  the total price and prints a "label" for the item
   //  --------------------------------------------------


   public static void main (String[] args)
   {
      final double OUNCES_PER_POUND = 16.0;


      double pricePerPound;    // price per pound
      double weightOunces;  // weight in ounces
      double weight;              // weight in pounds  
      double totalPrice;         // total price for the item
      
      Scanner scan = new Scanner(System.in);


      // Declare money as a NumberFormat object and use the
      // getCurrencyInstance method to assign it a value
         


      // Declare fmt as a DecimalFormat object and instantiate
      // it to format numbers with at least one digit to the left of the
      // decimal and the fractional part rounded to two digits.




      // prompt the user and read in each input
      System.out.println ("Welcome to the CS Deli!!\n ");
        
      System.out.print ("Enter the price per pound of your item: ");
      pricePerPound = scan.nextDouble();


      System.out.print ("Enter the weight (ounces): ");
      weightOunces = scan.nextDouble();


      // Convert ounces to pounds and compute the total price
      weight = weightOunces / OUNCES_PER_POUND;
      totalPrice = pricePerPound * weight;


      // Print the label using the formatting objects 
      // fmt for the weight in pounds and money for the prices




   }
}
*/

package week4;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Deli{
   public static void main (String[] args)
   {
      // Constant for the number of ounces per pound
      final double OUNCES_PER_POUND = 16.0;

      // Declare variables
      double pricePerPound;    // Price per pound
      double weightOunces;     // Weight in ounces
      double weightInPounds;   // Weight in pounds
      double totalPrice;       // Total price for the item
      Scanner scan = new Scanner(System.in);

      // Create a NumberFormat object for currency formatting
      NumberFormat money = NumberFormat.getCurrencyInstance();

      // Create a DecimalFormat object to format the weight to two decimal places
      DecimalFormat fmt = new DecimalFormat("0.00");
      System.out.print("Enter the price per pound of your item: ");
      pricePerPound = scan.nextDouble();
      System.out.print("Enter the weight (ounces): ");
      weightOunces = scan.nextDouble();

      // Convert ounces to pounds
      weightInPounds = weightOunces / OUNCES_PER_POUND;

      // Calculate total price for the item
      totalPrice = pricePerPound * weightInPounds;

      // Print the formatted label
      System.out.println("\n*******  CS Deli  *******\n");
      System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound");
      System.out.println("Weight: " + fmt.format(weightInPounds) + " pounds");
      System.out.println("\nTOTAL:  " + money.format(totalPrice));

      // Close the scanner to avoid resource leak
      scan.close();
   }
}
