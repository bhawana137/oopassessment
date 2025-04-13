package weekthree;

public class PunctuationMarks {
    public static void main(String[] args) {
        // The input string
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

        // Variables to store punctuation counts
        int commaCount = 0;
        int periodCount = 0;
        int hyphenCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // Count the punctuation marks
            if (c == ',') {
                commaCount++;
            } else if (c == '.') {
                periodCount++;
            } else if (c == '-') {
                hyphenCount++;
            }
        }

        // Print the results
        System.out.println("Punctuation Count Table:");
        System.out.println("---------------------");
        System.out.println("Punctuation  | Count");
        System.out.println("---------------------");
        System.out.println("     ,       |   " + commaCount);
        System.out.println("     .       |   " + periodCount);
        System.out.println("     -       |   " + hyphenCount);
      
    }
}
