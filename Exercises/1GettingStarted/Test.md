“Test”. Create a project, enter, compile and run the following application.
```
public class Test
{
   //----------------------------------------------------
   //  Prints a statement.
   //----------------------------------------------------
   public static void main (String[] args)
   {
      System.out.println ("An Emergency Broadcast");
   }
}
```
Introduce the following errors, one at a time. Note any messages that the compiler produces. Fix the previous error each time. If no error messages are produced, be prepared to explain why.

a. Change Test to test.

b. Change Emergency to emergency.

c. Remove the first quotation mark in the string.

d. Change main to man.

e. Change println to bogus.

f. Remove the semicolon at the end of the println statement.

g. Remove the last brace in the program.

a. 
```
package weekone;

public class test 
{
	   //----------------------------------------------------
	   //  Prints a statement.
	   //----------------------------------------------------
	   public static void main (String[] args)
	   {
	      System.out.println ("An Emergency Broadcast");
	   }
	
}

```
![image](https://github.com/user-attachments/assets/62b2b1b8-8ed5-4196-b870-b592a0918050)

Java is case-sensitive. If the filename remains Test.java while the class name is changed to test, the compiler cannot find the correct class to execute. To fix this, the class name should match the filename.

b.
```
package weekone;

public class Test 
{
	   //----------------------------------------------------
	   //  Prints a statement.
	   //----------------------------------------------------
	   public static void main (String[] args)
	   {
	      System.out.println ("An emergency Broadcast");
	   }
	
}
```
![image](https://github.com/user-attachments/assets/690e5469-971c-4ddf-b9a8-269eb7ead988)
Compiler error: none

Explanation: Changing a word inside a string does not affect compilation because string literals are not syntax-related.


c. 
```
package weekone;

public class Test 
{
	   //----------------------------------------------------
	   //  Prints a statement.
	   //----------------------------------------------------
	   public static void main (String[] args)
	   {
	      System.out.println (An emergency Broadcast");
	   }
	
}

```
![image](https://github.com/user-attachments/assets/082531cf-dfcc-4803-8fda-4b9a5e562468)
String literals must be enclosed in double quotes.

d.
```
package weekone;

public class Test 
{
	   //----------------------------------------------------
	   //  Prints a statement.
	   //----------------------------------------------------
	   public static void man (String[] args)
	   {
	      System.out.println ("An emergency Broadcast");
	   }
	
}

```
![image](https://github.com/user-attachments/assets/4dd56594-575d-49bf-902e-484e34a5e412)
The JVM requires a method named main as the program’s entry point. Changing it to man makes the JVM unable to find the starting method.

e.
```
package weekone;

public class Test 
{
	   //----------------------------------------------------
	   //  Prints a statement.
	   //----------------------------------------------------
	   public static void man (String[] args)
	   {
	      System.out.bogus ("An emergency Broadcast");
	   }
	
}

```
![image](https://github.com/user-attachments/assets/91148b3e-0000-4f77-8958-e8413d2829c0)
System.out does not have a method called bogus(). The correct method is println().

f.
```
package weekone;

public class Test 
{
	   //----------------------------------------------------
	   //  Prints a statement.
	   //----------------------------------------------------
	   public static void man (String[] args)
	   {
	      System.out.bogus ("An emergency Broadcast")
	   }
	
}
```
![image](https://github.com/user-attachments/assets/2538740c-672b-40af-b11d-bd7d5646a47d)
Java requires a semicolon (;) at the end of each statement. Removing it results in a syntax error.


g.
```
package weekone;

public class Test 
{
	   //----------------------------------------------------
	   //  Prints a statement.
	   //----------------------------------------------------
	   public static void main (String[] args)
	   {
	      System.out.println ("An emergency Broadcast");
	   }
	

```
![image](https://github.com/user-attachments/assets/d4a194bf-c5d2-4d0d-a71c-ac2da283663f)
Java uses curly braces {} to define code blocks. Removing the last } makes the class definition incomplete.








