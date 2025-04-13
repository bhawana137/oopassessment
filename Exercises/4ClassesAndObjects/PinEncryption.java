package week4;
import java.util.Random;
import java.util.Scanner;

public class PinEncryption{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4 digit pin number to encrypt: ");
        int pin = scanner.nextInt(); // Read the pin number

        // Convert the pin number to hexadecimal
        String hexPin = Integer.toHexString(pin); // Convert to hex

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Generate the first random number between 1000 and 65536
        int rand1 = 1000 + random.nextInt(64536); // Random number between 1000 and 65536
        // Generate the second random number between 1000 and 65536
        int rand2 = 1000 + random.nextInt(64536); // Random number between 1000 and 65536

        // Convert the random numbers to hexadecimal
        String hexRand1 = Integer.toHexString(rand1); // Convert first random number to hex
        String hexRand2 = Integer.toHexString(rand2); // Convert second random number to hex

        // "Sandwich" the pin between the two random hexadecimal numbers
        String encryptedPin = hexRand1 + hexPin + hexRand2; // Combine them together

        // Print the encrypted pin
        System.out.println("Your encrypted pin number is " + encryptedPin);
    }
}

