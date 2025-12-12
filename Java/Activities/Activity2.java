package activities;
public class Activity2 {

    public static void main(String[] args) {

        int[] numbers = {10, 77, 10, 54, -11, 10};
        int sum = 0;

        // Loop through the array and add all 10's
        for (int num : numbers) {
            if (num == 10) {
                sum += num;
            }
        }

        // Check if sum equals 30
        boolean result = (sum == 30);

        // Print result
        System.out.println("Sum of 10's = " + sum);
        System.out.println("Result: " + result);
    }
}