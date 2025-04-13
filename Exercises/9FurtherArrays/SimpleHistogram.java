/*
 Histogram
Design and implement an application that creates a histogram that allows you to visually inspect the frequency distribution of a set of values. 
The program should read in an arbitrary number of integers that are in the range 1 to 100 inclusive; then it should produce a chart similar to the 
following one that indicates how many input values fell in the range 1 – 10, 11 – 20, and so on. Print one asterisk for each value entered.
1 - 10  | ***
11- 20  | *
21- 30  | *****
31- 40  |
41- 50  | ******
51 -60  | ***
61- 70  | *
71- 80  | *****
81- 90  |
91 -100 | **
*/
package week9;
import java.util.Scanner;

public class SimpleHistogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This array will store how many numbers fall in each range
        int[] ranges = new int[10]; // 10 groups: 1-10, 11-20, ..., 91-100

        System.out.println("Enter numbers between 1 and 100.");
        System.out.println("Type -1 when you are finished.");

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number == -1) {
                break; // stop if user enters -1
            }

            if (number >= 1 && number <= 100) {
                int index = (number - 1) / 10; // find which group it belongs to
                ranges[index]++;
            } else {
                System.out.println("Number must be between 1 and 100.");
            }
        }

        // Print the histogram
        System.out.println("\nHistogram:");
        for (int i = 0; i < 10; i++) {
            int start = i * 10 + 1;
            int end = (i + 1) * 10;

            System.out.printf("%2d - %3d | ", start, end);
            for (int j = 0; j < ranges[i]; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }

        scanner.close();
    }
}

