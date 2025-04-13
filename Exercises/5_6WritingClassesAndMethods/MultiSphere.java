package week5;
public class MultiSphere {
    public static void main(String[] args) {
        // Create three Sphere objects with different diameters
        Sphere sphere1 = new Sphere(10.0);
        Sphere sphere2 = new Sphere(5.5);
        Sphere sphere3 = new Sphere(8.2);

        // Print details about sphere1
        System.out.println(sphere1.toString());
        System.out.printf("Volume: %.4f\n", sphere1.getVolume());
        System.out.printf("Surface Area: %.4f\n", sphere1.getSurfaceArea());
        System.out.println();

        // Print details about sphere2
        System.out.println(sphere2.toString());
        System.out.printf("Volume: %.4f\n", sphere2.getVolume());
        System.out.printf("Surface Area: %.4f\n", sphere2.getSurfaceArea());
        System.out.println();

        // Print details about sphere3
        System.out.println(sphere3.toString());
        System.out.printf("Volume: %.4f\n", sphere3.getVolume());
        System.out.printf("Surface Area: %.4f\n", sphere3.getSurfaceArea());
        System.out.println();

        // Update the diameter of sphere2
        sphere2.setDiameter(7.0);
        System.out.println("Updated " + sphere2.toString());
        System.out.printf("New Volume: %.4f\n", sphere2.getVolume());
        System.out.printf("New Surface Area: %.4f\n", sphere2.getSurfaceArea());
    }
}

// Class that represents a Sphere
class Sphere {
    private double diameter;

    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getVolume() {
        double radius = diameter / 2;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        double radius = diameter / 2;
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Sphere with diameter: " + diameter;
    }
}


