/*
Write a Java program that prints a table with a list of at least 5 students together with their grades earned (lab points, bonus points, and 
the total) in the format below.
///////////////////\\\\\\\\\\\\\\\\\\\
==          Student Points          ==
\\\\\\\\\\\\\\\\\\\///////////////////


Name            Lab     Bonus   Total
----            ---     -----   -----
Joe             43      7       50
William         50      8       58
Mary Sue        39      10      49

The requirements for the program are as follows:

Print the border on the top as illustrated (using the slash and backslash characters).
Use tab characters to get your columns aligned and you must use the + operator both for addition and string concatenation.
Make up your own student names and points—the ones shown are just for illustration purposes. You need 5 names.
*/

package week2;
public class StudentScores {
    public static void main(String[] args) {
        // Print the top border
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        // Print table header
        System.out.println();
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");

        // Print student data
        System.out.println("Bhawana\t\t45\t5\t" + (45 + 8));
        System.out.println("Celina\t\t38\t6\t" + (39 + 9));
        System.out.println("Smriti\t\t50\t7\t" + (47 + 5));
        System.out.println("Sneha\t\t41\t8\t" + (43+ 6));
        System.out.println("Yuri\t\t47\t9\t" + (40 + 7));
    }
}
