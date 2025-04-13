package week4;
import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Ask the user for number of sides on each die
        System.out.print("How many sides does die 1 have? ");
        int sidesDie1 = input.nextInt();

        System.out.print("How many sides does die 2 have? ");
        int sidesDie2 = input.nextInt();

        // Variables to keep track of totals
        int totalDie1 = 0;
        int totalDie2 = 0;

        // Roll both dice 3 times
        for (int i = 1; i <= 3; i++) {
            int roll1 = rand.nextInt(sidesDie1) + 1; // roll between 1 and sidesDie1
            int roll2 = rand.nextInt(sidesDie2) + 1; // roll between 1 and sidesDie2

            // Add to totals
            totalDie1 += roll1;
            totalDie2 += roll2;

            // Figure out which roll it is (first, second, third)
            String rollName = "";
            if (i == 1) {
                rollName = "first";
            } else if (i == 2) {
                rollName = "second";
            } else {
                rollName = "third";
            }

            // Show the result of the current roll
            System.out.println("Die 1 " + rollName + " roll = " + roll1 + ".");
            System.out.println("Die 2 " + rollName + " roll = " + roll2 + ".");
        }

        // Calculate averages
        double averageDie1 = totalDie1 / 3.0;
        double averageDie2 = totalDie2 / 3.0;

        // Show final results
        System.out.println("Die 1 rolled a total of " + totalDie1 + " and rolled " + averageDie1 + " on average.");
        System.out.println("Die 2 rolled a total of " + totalDie2 + " and rolled " + averageDie2 + " on average.");

        // Close the scanner
        input.close();
    }
}
