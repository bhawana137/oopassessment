/*
 Write and application that prints the following diamond shape. Don’t print any unneeded characters

       *
      ***
     *****
    *******
     *****
      ***
       *
*/
package weekone;

public class Diamond {
   public static void main(String[] args) {
	        int i, j;

	        // Upper part of the diamond
	        for (i = 1; i <= 4; i++) {
	            for (j = 4; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Lower part of the diamond
	        for (i = 3; i >= 1; i--) {
	            for (j = 4; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	

}
