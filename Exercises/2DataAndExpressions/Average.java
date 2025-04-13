/* Write a Java program that prints a table with a list of at least 5 students together with their grades earned (lab points, bonus points,
and the total) in the format below.
///////////////////\\\\\\\\\\\\\\\\\\\
==          Student Points          ==
\\\\\\\\\\\\\\\\\\\///////////////////


Name            Lab     Bonus   Total
----            ---     -----   -----
Joe             43      7       50
William         50      8       58
Mary Sue        39      10      49
*/

package week2;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in);

        // Asking for user input
        System.out.println("Please enter three integers and I will compute their average.");
        
        System.out.print("Enter the first value: ");
        val1 = scan.nextInt();  // Taking first value input
        
        System.out.print("Enter the second value: ");
        val2 = scan.nextInt();  // Taking second value input
        
        System.out.print("Enter the third value: ");
        val3 = scan.nextInt();  // Taking third value input

        // Calculating the average
        average = (val1 + val2 + val3) / 3.0;  // Dividing by 3.0 for floating point result

        // Output the result
        System.out.println("The average is " + average + ".");

        scan.close(); 
    }
}
