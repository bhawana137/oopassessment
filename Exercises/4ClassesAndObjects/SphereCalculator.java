package week4;
import java.util.Scanner;

public class SphereCalculator{
	public static void main(String[] args){
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the radius of the sphere
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble(); // Read the radius
        
        // Define Pi as 3.14
        final double PI = 3.14;
        
        // Calculate the volume of the sphere using the formula
        double volume = (4.0 / 3.0) * PI * radius * radius * radius;
        
        // Calculate the surface area of the sphere using the formula
        double surfaceArea = 4 * PI * radius * radius;
        
        // Print the results, rounded to 4 decimal places
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface Area: %.4f\n", surfaceArea);
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
