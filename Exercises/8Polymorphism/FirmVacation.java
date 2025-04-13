package week8;

// Interface that defines a contract for encryption
interface Encryptable {
    String encrypt(String input);  // any class that implements this must define this method
}

// Class that encrypts a message by reversing the text
class Password implements Encryptable {

    // Encrypt by reversing the input string
    public String encrypt(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Decrypt by reversing again (returns original message)
    public String decrypt(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}

// Class that encrypts using Caesar cipher (shifts letters by 3 positions)
class Secret implements Encryptable {

    // Encrypt the message using Caesar cipher logic
    public String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // Wrap around for uppercase letters
                char shifted = (char) ('A' + (c - 'A' + 3) % 26);
                encrypted.append(shifted);
            } else if (Character.isLowerCase(c)) {
                // Wrap around for lowercase letters
                char shifted = (char) ('a' + (c - 'a' + 3) % 26);
                encrypted.append(shifted);
            } else {
                // Leave spaces and punctuation unchanged
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }
}

// Main class to demonstrate polymorphism and encryption methods
public class FirmVacation {
    public static void main(String[] args) {
        // Declare a variable that can reference any Encryptable object
        Encryptable encryptable;

        // Encrypt using Secret
        encryptable = new Secret();
        String secretMessage = "Hello World!";
        String encryptedSecret = encryptable.encrypt(secretMessage);

        System.out.println("=== Using Secret (Caesar Cipher) ===");
        System.out.println("Original Message:  " + secretMessage);
        System.out.println("Encrypted Message: " + encryptedSecret);
        System.out.println();

        // Encrypt using Password
        encryptable = new Password();
        String passwordMessage = "MyPassword";
        String encryptedPassword = encryptable.encrypt(passwordMessage);

        System.out.println("=== Using Password (String Reversal) ===");
        System.out.println("Original Password:  " + passwordMessage);
        System.out.println("Encrypted Password: " + encryptedPassword);

        // Decrypt using Password (need to use actual Password class to call decrypt)
        Password password = new Password();
        String decryptedPassword = password.decrypt(encryptedPassword);
        System.out.println("Decrypted Password: " + decryptedPassword);
    }
}

