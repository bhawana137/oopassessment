/*
Bulb
Design and implement a class called Bulb that represents a light bulb that can be turned on and off.
Create a driver class called Lights, whose main method instantiates and turns on some Bulb objects
*/

package week5;
public class Lights {
    public static void main(String[] args) {
        // Create three Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        // Display the initial state of each bulb
        System.out.println("Initial state of bulbs:");
        System.out.println("Bulb 1 is " + bulb1);
        System.out.println("Bulb 2 is " + bulb2);
        System.out.println("Bulb 3 is " + bulb3);

        // Turn on the first two bulbs
        bulb1.turnOn();
        bulb2.turnOn();

        // Display the current state of each bulb
        System.out.println("\nCurrent state of bulbs:");
        System.out.println("Bulb 1 is " + bulb1);
        System.out.println("Bulb 2 is " + bulb2);
        System.out.println("Bulb 3 is " + bulb3);
    }
}

class Bulb {
    // Instance variable to store the state of the bulb
    private boolean isOn;

    // Constructor to initialize the bulb state to OFF
    public Bulb() {
        this.isOn = false; // Bulb is initially off
    }

    // Method to turn the bulb on
    public void turnOn() {
        isOn = true;
    }

    // Method to turn the bulb off
    public void turnOff() {
        isOn = false;
    }

    // Method to check if the bulb is on
    public boolean isOn() {
        return isOn;
    }

    // Method to get a string representation of the bulb's state
    @Override
    public String toString() {
        return isOn ? "ON" : "OFF";
    }
}
