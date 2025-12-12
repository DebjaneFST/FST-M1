package activities;

public class Activity1 {

    public static void main(String[] args) {

        // Create a Car object
        Car myCar = new Car();

        // Assign values
        myCar.color = "Red";
        myCar.transmission = "Automatic";
        myCar.make = 2024;

        // Display details and call methods
        myCar.displayCharacteristics();
        myCar.accelarate();
        myCar.brake();
    }
}
