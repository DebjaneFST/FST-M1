package activities;
import java.util.HashMap;
import java.util.Map;

public class Activity11 {

    public static void main(String[] args) {

        // Create a Map with Integer keys and String values
        Map<Integer, String> colours = new HashMap<>();

        // Add 5 random colours
        colours.put(1, "Violete");
        colours.put(2, "Indigo");
        colours.put(3, "Blue");
        colours.put(4, "Green");
        colours.put(5, "Orange");

        // Print the map
        System.out.println("Original Map: " + colours);

     // Remove one colour using remove()
        colours.remove(3); // removes Yellow
        System.out.println("After removing key 3: " + colours);

        // Check if the colour green exists
        System.out.println("Does the map contain 'Green'? " + colours.containsValue("Green"));

        // Print size of the map
        System.out.println("Size of the Map: " + colours.size());
    }
}