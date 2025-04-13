package weekthree;
import java.util.Scanner;

public class stringreverser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask for a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Print the sentence with each word reversed
        for (String word : words) {
            String reversedWord = "";
            // Reverse each word
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            System.out.print(reversedWord + " ");
        }
        scan.close();
    }
}

