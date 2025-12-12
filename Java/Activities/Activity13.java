package activities;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {

        // Create objects
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("Enter integers and non-integer to stop:");

        // Accept only integer inputs
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            list.add(num);
        }

        // Convert ArrayList to array
        Integer nums[] = list.toArray(new Integer[0]);

        // Check if list is empty
        if (nums.length == 0) {
            System.out.println("No valid integers entered.");
            return;
        }

        // Generate random index
        int index = indexGen.nextInt(nums.length);

        // Print results
        System.out.println("\nRandom index generated: " + index);
        System.out.println("Value at this index: " + nums[index]);

        scan.close();
    }
}
