package lab_4;

import java.util.Scanner;

public class TestNames {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt and read the first name, middle name, and last name for the first person
        System.out.print("Enter the first name of the first person: ");
        String first1 = input.nextLine();
        System.out.print("Enter the middle name of the first person: ");
        String middle1 = input.nextLine();
        System.out.print("Enter the last name of the first person: ");
        String last1 = input.nextLine();

        // Prompt and read the first name, middle name, and last name for the second person
        System.out.print("Enter the first name of the second person: ");
        String first2 = input.nextLine();
        System.out.print("Enter the middle name of the second person: ");
        String middle2 = input.nextLine();
        System.out.print("Enter the last name of the second person: ");
        String last2 = input.nextLine();

        // Create Name objects for both people
        Name name1 = new Name(first1, middle1, last1);
        Name name2 = new Name(first2, middle2, last2);

        // Output the first-middle-last version, last-first-middle version, initials, and length for both names
        System.out.println("\nFor the first person:");
        System.out.println("First-Middle-Last: " + name1.firstMiddleLast());
        System.out.println("Last-First-Middle: " + name1.lastFirstMiddle());
        System.out.println("Initials: " + name1.initials());
        System.out.println("Length of name (no spaces): " + name1.length());

        System.out.println("\nFor the second person:");
        System.out.println("First-Middle-Last: " + name2.firstMiddleLast());
        System.out.println("Last-First-Middle: " + name2.lastFirstMiddle());
        System.out.println("Initials: " + name2.initials());
        System.out.println("Length of name (no spaces): " + name2.length());

        // Check if the two names are the same
        if (name1.equals(name2)) {
            System.out.println("\nThe names are the same.");
        } else {
            System.out.println("\nThe names are different.");
        }

        input.close();
    }
}