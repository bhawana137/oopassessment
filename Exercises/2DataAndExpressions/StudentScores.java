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
