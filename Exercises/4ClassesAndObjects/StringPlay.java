/*
 Using String Objects
Fill in the blanks in the program below as follows:
(a) declare the variable town as a reference to a String object and initialize it to "Anytown, UK". (b) write an assignment statement that invokes 
the length method of the string class to find the length of the college String object and assigns the result to the stringLength variable 
(c) complete the assignment statement so that change1 contains the same characters as college but all in upper case (d) complete the assignment 
statement so that change2 is the same as change1 except all lowercase “e's” are replaced with the asterisk (*) character. (e) complete the 
assignment statement so that change3 is the concatenation of college and town (use the concat method of the String class rather than the + operator)
// **************************************************
//   StringPlay.java
//
//   Play with String objects
// **************************************************
public class StringPlay
{
   public static void main (String[] args)
   {
      String college = new String ("Leeds Beckett University"); //Similar for part (a)


      ________________________________________________________; // part (a)


      int stringLength;
      String change1, change2, change3; 


      ________________________________________________________; // part (b)


      System.out.println (college + " contains " + stringLength + " characters.");


      change1 = ______________________________________________; // part (c)


      change2 = ______________________________________________; // part (d)


      change3 = ______________________________________________; // part (e)


      System.out.println ("The final string is " + change3);
    }
}
*/

package week4;
public class StringPlay {
	public static void main (String[] args)
		   {
		      String college = new String ("Leeds Beckett University"); // Similar for part (a)

		      String town = new String ("Anytown, UK"); // part (a)

		      int stringLength;
		      String change1, change2, change3; 

		      stringLength = college.length(); // part (b)

		      System.out.println (college + " contains " + stringLength + " characters.");

		      change1 = college.toUpperCase(); // part (c)

		      change2 = college.replace('e', '*').toUpperCase(); // part (d) — fixed for lowercase 'e'

		      change3 = college.concat(town); // part (e)

		      System.out.println ("The final string is " + change3);
		   }
		}
