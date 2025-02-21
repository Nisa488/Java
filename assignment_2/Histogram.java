package assignment_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Histogram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int input;

        System.out.println("Enter numbers between 1 and 50. Enter -1 to stop.");

        while (true) {
            System.out.print("Please enter a number: ");
            input = scanner.nextInt();
            if (input == -1) {
                break;
            } else if (input >= 1 && input <= 50) {
                numbers.add(input);
            } else {
                System.out.println("Please enter a number between 1 and 50 or -1 to stop.");
            }
        }

        int[] ranges = new int[5]; 

        for (int number : numbers) {
            if (number >= 1 && number <= 10) ranges[0]++;
            else if (number >= 11 && number <= 20) ranges[1]++;
            else if (number >= 21 && number <= 30) ranges[2]++;
            else if (number >= 31 && number <= 40) ranges[3]++;
            else if (number >= 41 && number <= 50) ranges[4]++;
        }

        System.out.println("Histogram:");
        System.out.printf("1  - 10 | %s\n", "*".repeat(ranges[0]));
        System.out.printf("11 - 20 | %s\n", "*".repeat(ranges[1]));
        System.out.printf("21 - 30 | %s\n", "*".repeat(ranges[2]));
        System.out.printf("31 - 40 | %s\n", "*".repeat(ranges[3]));
        System.out.printf("41 - 50 | %s\n", "*".repeat(ranges[4]));

        scanner.close();
    }
}
