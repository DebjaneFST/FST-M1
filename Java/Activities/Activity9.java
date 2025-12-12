package activities;
import java.util.ArrayList;

public class Activity9 {

    public static void main(String[] args) {

        // Create ArrayList of Strings
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names
        myList.add("Debjane");
        myList.add("Debolina");
        myList.add("Diotima");
        myList.add("Devendra");
        myList.add("Debashis");

        // Print all names using a for loop
        System.out.println("All Names in the List:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Retrieve the 3rd name (index 2)
        String thirdName = myList.get(2);
        System.out.println("\n3rd Name in the list: " + thirdName);

        // Check if a name exists
        String nameToCheck = "Diotima";
        System.out.println("\nDoes the list contain '" + nameToCheck + "'? " + myList.contains(nameToCheck));

        // Print size
        System.out.println("\nSize of list: " + myList.size());

        // Remove a name
        myList.remove("Devendra");
        System.out.println("After removing 'Devendra', new size: " + myList.size());
    }
}
