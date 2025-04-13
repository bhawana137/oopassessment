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
