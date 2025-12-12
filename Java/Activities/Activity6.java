package activities;

import java.util.ArrayList;
import java.util.Date;

 class Plane {

    private int maxPassengers;
    private ArrayList<String> passengers;
    private Date lastTimeTakenOff;
    private Date lastTimeLanded;

    // Constructor
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // Add passengers
    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Plane is full! Cannot onboard more passengers.");
        }
    }

    // Takeoff: return current time
    public Date takeOff() {
        lastTimeTakenOff = new Date();
        return lastTimeTakenOff;
    }

    // Land: store landing time + clear passenger list
    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    // Get last landing time
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    // Get passengers
    public ArrayList<String> getPassengers() {
        return passengers;
    }
}

public class Activity6 {

    public static void main(String[] args) {

        // Create plane object with max passengers = 10
        Plane plane = new Plane(10);

        // Add passengers
        plane.onboard("Sharma");
        plane.onboard("Emma");
        plane.onboard("Gupta");
        plane.onboard("Rima");

        // Take off and print time
        System.out.println("Take-off time: " + plane.takeOff());

        // Print passengers on board
        System.out.println("Passengers still on the plane after Landing: " + plane.getPassengers());

        try {
            // Pause for 5 seconds to simulate flight
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Land the plane
        plane.land();
        System.out.println("Landing time: " + plane.getLastTimeLanded());
    }
}
