package assignment_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter a sequence of positive integers. "
        		+ "Enter -1 to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            } else if (num > 0) {
                numbers.add(num);
            } else {
                System.out.println("Please enter a positive integer or "
                		+ "-1 to stop.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No valid numbers entered.");
            scanner.close();
            return;
        }

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        double average = numbers.stream().mapToInt(Integer::intValue).
        		average().orElse(0.0);

        Collections.sort(numbers);
        double median;
        int size = numbers.size();
        if (size % 2 == 0) {
            median = (numbers.get(size / 2 - 1) + numbers.get(size / 2)) / 2.0;
        } else {
            median = numbers.get(size / 2);
        }

        System.out.println("\nResults:");
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Median: " + median);
        System.out.println("Numbers in ascending order: " + numbers);

        scanner.close();
    }
}
