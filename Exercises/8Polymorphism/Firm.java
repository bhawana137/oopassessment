package week8;

//Main class 
public class Firm {
   public static void main(String[] args) {
     // Creating employees with their roles and IDs
     Employee manager = new Manager("Preeti Rai", "M001", "Manager");
     Employee engineer = new Engineer("Celina Gurung", "E001", "Engineer");
     Employee clerk = new Clerk("Samantha Sharma", "C001", "Clerk");

     // Displaying each employee's details and their vacation days
     System.out.println(manager);
     System.out.println(manager.getVacationDetails());
     System.out.println();

     System.out.println(engineer);
     System.out.println(engineer.getVacationDetails());
     System.out.println();

     System.out.println(clerk);
     System.out.println(clerk.getVacationDetails());
 }
}

//Base Employee class
class Employee {
 protected String name;
 protected String id;
 protected String role;

 // Constructor to initialize basic employee details
 public Employee(String name, String id, String role) {
     this.name = name;
     this.id = id;
     this.role = role;
 }

 // Abstract method for vacation details (to be customized by each subclass)
 public String getVacationDetails() {
     return role + " has a standard vacation policy.";
 }

 // Override to return a string representation of the employee
 @Override
 public String toString() {
     return "Employee ID: " + id + "\nName: " + name + "\nRole: " + role;
 }
}

//Manager class (inherits from Employee)
class Manager extends Employee {

 // Constructor for Manager, setting name, ID, and role
 public Manager(String name, String id, String role) {
     super(name, id, role);
 }

 // Overriding method to provide vacation details specific to Managers
 @Override
 public String getVacationDetails() {
     return role + " is entitled to 25 vacation days per year.";
 }
}

//Engineer class (inherits from Employee)
class Engineer extends Employee {

 // Constructor for Engineer, setting name, ID, and role
 public Engineer(String name, String id, String role) {
     super(name, id, role);
 }

 // Overriding method to provide vacation details specific to Engineers
 @Override
 public String getVacationDetails() {
     return role + " is entitled to 20 vacation days per year.";
 }
}

//Clerk class (inherits from Employee)
class Clerk extends Employee {

 // Constructor for Clerk, setting name, ID, and role
 public Clerk(String name, String id, String role) {
     super(name, id, role);
 }

 // Overriding method to provide vacation details specific to Clerks
 @Override
 public String getVacationDetails() {
     return role + " is entitled to 15 vacation days per year.";
 }
}
