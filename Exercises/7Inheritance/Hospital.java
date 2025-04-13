/*
Hospital
Design and implement a set of classes that define the employees of a hospital: doctor, nurse, receptionist, cleaner etc. Include methods in each
class that are named according to the services provided by that person and that print an appropriate message. Eg Nurse Emp# has patients, Doctor 
Emp# specializes in Cleaner, Emp# of is sweeping.
Create a driver class to instantiate and test the classes
*/

package week7;

// Base class for all hospital employees
class Employee {
    int empId;  // Employee ID
    String name;  // Employee's name
    
    // Constructor to initialize employee ID and name
    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Method to display basic information about the employee
    public void work() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
    }
}

// Doctor class that inherits from Employee
class Doctor extends Employee {

    // Constructor for Doctor
    public Doctor(int empId, String name) {
        super(empId, name);  // Initialize ID and name using the parent class constructor
    }

    // Method to simulate the doctor treating patients
    public void treatPatients() {
        System.out.println("Doctor " + name + " (Emp#" + empId + ") is treating patients.");
    }
}

// Nurse class that inherits from Employee
class Nurse extends Employee {

    // Constructor for Nurse
    public Nurse(int empId, String name) {
        super(empId, name);  // Initialize ID and name using the parent class constructor
    }

    // Method to simulate the nurse caring for patients
    public void careForPatients() {
        System.out.println("Nurse " + name + " (Emp#" + empId + ") is caring for patients.");
    }
}

// Receptionist class that inherits from Employee
class Receptionist extends Employee {

    // Constructor for Receptionist
    public Receptionist(int empId, String name) {
        super(empId, name);  // Initialize ID and name using the parent class constructor
    }

    // Method to simulate the receptionist scheduling appointments
    public void scheduleAppointments() {
        System.out.println("Receptionist " + name + " (Emp#" + empId + ") is scheduling appointments.");
    }
}

// Cleaner class that inherits from Employee
class Cleaner extends Employee {

    // Constructor for Cleaner
    public Cleaner(int empId, String name) {
        super(empId, name);  // Initialize ID and name using the parent class constructor
    }

    // Method to simulate the cleaner sweeping floors
    public void cleanRooms() {
        System.out.println("Cleaner " + name + " (Emp#" + empId + ") is sweeping the floors.");
    }
}

// Driver class to test all employees
public class Hospital {
    
    public static void main(String[] args) {
        // Create instances of each employee (Doctor, Nurse, Receptionist, Cleaner)
        Doctor doctor = new Doctor(1, "Bhawana");
        Nurse nurse = new Nurse(2, "Laxmi");
        Receptionist receptionist = new Receptionist(3, "Kalpana");
        Cleaner cleaner = new Cleaner(4, "Sirishma");

        // Testing each employee by calling their work and specific tasks
        System.out.println("------ Doctor's Work ------");
        doctor.work();  // Display doctor's basic info
        doctor.treatPatients();  // Simulate doctor treating patients

        System.out.println("\n------ Nurse's Work ------");
        nurse.work();  // Display nurse's basic info
        nurse.careForPatients();  // Simulate nurse caring for patients

        System.out.println("\n------ Receptionist's Work ------");
        receptionist.work();  // Display receptionist's basic info
        receptionist.scheduleAppointments();  // Simulate receptionist scheduling appointments

        System.out.println("\n------ Cleaner's Work ------");
        cleaner.work();  // Display cleaner's basic info
        cleaner.cleanRooms();  // Simulate cleaner sweeping the floors
    }
}
