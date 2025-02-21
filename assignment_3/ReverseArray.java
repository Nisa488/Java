package assignment_3;
//3.1
import java.util.Scanner;

public class ReverseArray {

    // Method to reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Swap elements until start and end pointers meet
        while (start < end) {
            // Swap the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers towards the middle
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter the number of values you want to input: ");
        int n = scanner.nextInt();

        // Create an array to store the values
        int[] values = new int[n];

        // Prompt the user to enter the specified number of values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        // Print the original array
        System.out.print("Array before reversal: ");
        printArray(values);

        // Reverse the array
        reverseArray(values);

        // Print the reversed array
        System.out.print("Array after reversal: ");
        printArray(values);

        scanner.close();
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
