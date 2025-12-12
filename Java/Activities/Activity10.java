package activities;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<String> hs = new HashSet<>();

        // Add 6 objects
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");

        // Print size
        System.out.println("Size of HashSet: " + hs.size());

        // Remove an element
        System.out.println("\nRemoving 'D': " + hs.remove("D"));

        // Try removing an element not in the Set
        System.out.println("Removing 'E': " + hs.remove("E"));

        // Check if an element exists
        System.out.println("\nDoes HashSet contain 'A'? " + hs.contains("A"));
        System.out.println("Does HashSet contain 'D'? " + hs.contains("D"));

        // Print updated set
        System.out.println("\nUpdated HashSet: " + hs);
    }
}

