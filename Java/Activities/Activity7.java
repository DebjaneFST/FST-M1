package activities;
 interface BicycleParts {
    int tyres = 2;       // number of tyres
    int maxSpeed = 50;   // max speed of bicycle
}
 interface BicycleOperations {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

 class Bicycle implements BicycleParts, BicycleOperations {

    protected int gears;
    protected int currentSpeed;

    // Constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    // Reduce speed
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
    }

    // Increase speed
    public void speedUp(int increment) {
        currentSpeed += increment;
    }

    // Description method
    public void bicycleDesc() {
        System.out.println("Number of gears: " + gears);
        System.out.println("Max speed: " + maxSpeed);
    }
}

 class MountainBike extends Bicycle {

    private int seatHeight;

    // Constructor
    public MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed); // calling parent constructor
        this.seatHeight = seatHeight;
    }

    // Setter method
    public void setHeight(int newHeight) {
        seatHeight = newHeight;
    }

    // Override description
    @Override
    public void bicycleDesc() {
        super.bicycleDesc();
        System.out.println("Seat height: " + seatHeight);
    }
}

public class Activity7 {

    public static void main(String[] args) {

        // Create a MountainBike object
        MountainBike mb = new MountainBike(5, 20, 10);

        // Display description
        mb.bicycleDesc();

        // Speed up
        mb.speedUp(10);
        System.out.println("Current Speed after speeding up: " + mb.currentSpeed);

        // Apply brake
        mb.applyBrake(5);
        System.out.println("Current Speed after braking: " + mb.currentSpeed);

        // Change seat height
        mb.setHeight(15);
        System.out.println("Updated seat height:");
        mb.bicycleDesc();
    }
}
