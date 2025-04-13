Test
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
Compiler error: none Explanation: Changing a word inside a string does not affect compilation because string literals are not syntax-related.


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






5 -
a) As of February 2025, the latest release of the Java Standard Edition (Java SE) Platform is JDK 23.0.2. Additionally, JDK 21 is the most recent Long-Term Support (LTS) release. 

b)  Java SE (Standard Edition) is used for making desktop and server applications. It includes core Java features like data structures, networking, and the Java Virtual Machine (JVM). In contrast, Java ME (Micro Edition) is for small devices like mobile phones, embedded systems, and IoT devices. It has a smaller set of features compared to Java SE.

c) Java works on Windows, macOS, Linux, and even some mobile and embedded operating systems. Since Java is platform-independent, it can run on any OS that has a Java Virtual Machine (JVM).

d) Apart from Eclipse, the most popular Java IDE is IntelliJ IDEA.

e) The main() function is the starting point of any Java program. 

