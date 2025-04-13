package week9;
import java.util.Scanner;

// Class to represent an individual with first name, last name, and postal code
class Person {
    private String firstName;
    private String lastName;
    private String postalCode;

    // Constructor to initialize the fields
    public Person(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    // Method to print the person's details in a formatted, aligned table
    public void printInfo() {
        // Using printf to print in aligned columns
        System.out.printf("| %-15s | %-15s | %-15s |\n", firstName, lastName, postalCode);
    }
}

public class PostalCodeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Limit to 25 persons
        Person[] persons = new Person[25];
        int count = 0;

        // Modified welcoming and instruction message
        System.out.println("=======================================");
        System.out.println("  Welcome to the Postal Code Entry App!");
        System.out.println("=======================================");
        System.out.println("You can add up to 25 individuals.");
        System.out.println("For each person, please provide their First Name, Last Name, and Postal Code.");
        System.out.println("When you are done entering the data, simply press Enter without typing anything.");
        System.out.println("Let's begin!\n");

        // Input loop to enter up to 25 persons or stop if the user presses Enter without input
        while (count < 25) {
            System.out.printf("Enter details for person %d (First Name [TAB] Last Name [TAB] Postal Code):\n", count + 1);
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                // If user presses Enter without input, stop input
                System.out.println("\nNo input provided. Stopping data entry.\n");
                break;
            }

            // Split the input into parts (tab-separated input)
            String[] parts = input.split("\t"); // Tab-separated input

            if (parts.length == 3) {
                // Create a new Person object with the input data
                Person person = new Person(parts[0], parts[1], parts[2]);
                persons[count] = person;
                count++;
            } else {
                System.out.println("Invalid input. Please enter First Name, Last Name, and Postal Code.");
            }
        }

        // Display the stored information in a formatted table
        if (count == 0) {
            System.out.println("No data to display.\n");
        } else {
            System.out.println("\n******************* List of Persons *******************");
            // Table header with proper alignment
            System.out.println("-------------------------------------------------------");
            System.out.printf("| %-15s | %-15s | %-15s |\n", "First Name", "Last Name", "Postal Code");
            System.out.println("|-----------------|-----------------|-----------------|");

            // Print each person's details
            for (int i = 0; i < count; i++) {
                persons[i].printInfo(); // Call printInfo to print each person's data in the formatted table
            }

            System.out.println("-------------------------------------------------------");
        }
        System.out.println("\nThank you for using the Postal Code Entry App!");
        System.out.println("Goodbye!");

        scanner.close();
    }
}
