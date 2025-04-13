// Write an application that prompts for and reads integer representing the length of a square’s side, then prints the square’s perimeter and area.

package week2;
import java.util.Scanner;
public class SquareCalculations {
    public static void main(String[] args) {
        int length, perimeter, area;
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the length of the square
        System.out.print("Enter the length of the square: ");
        length = scan.nextInt();

        // Calculate perimeter and area
        perimeter = 4 * length;  // Perimeter formula: 4 * length
        area = length * length;  // Area formula: length*length

        // Display the results
        System.out.println("The perimeter of the square is: " + perimeter);
        System.out.println("The area of the square is: " + area);

        scan.close();
    }
}

