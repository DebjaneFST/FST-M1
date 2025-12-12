package activities;
public class Activity4 {

    public static void main(String[] args) {

        // Initialize array in random order
        int[] numbers = {4, 3, 2, 10, 12, 1, 5, 6};

        // Display array before sorting
        System.out.print("Before Sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Insertion Sort
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            // Shift elements that are greater than key
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            // Insert key into correct position
            numbers[j + 1] = key;
        }

        // Display array after sorting
        System.out.print("After Sorting:  ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
