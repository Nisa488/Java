package lab_4;

import java.util.Scanner;

public class Student {
    // Declare instance data
    private String name;
    private int test1;
    private int test2;

    //-----------------------------------------------
    // Constructor: Initializes the student's name
    //-----------------------------------------------
    public Student(String studentName) {
        name = studentName; // Set the student's name
    }

    //-----------------------------------------------
    // inputGrades: Prompt for and read in student's grades for test1 and test2
    // Use name in prompts, e.g., "Enter Mary's score for test1"
    //-----------------------------------------------
    public void inputGrades() {
        try (Scanner input = new Scanner(System.in)) {
			// Prompt for and read in the student's grades
			System.out.print("Enter " + name + "'s score for Test 1: ");
			test1 = input.nextInt(); // Get score for Test 1

			System.out.print("Enter " + name + "'s score for Test 2: ");
			test2 = input.nextInt(); // Get score for Test 2
		}
    }

    //-----------------------------------------------
    // getAverage: Compute and return the student's test average
    //-----------------------------------------------
    public double getAverage() {
        return (test1 + test2) / 2.0; // Calculate the average of test1 and test2
    }

    //-----------------------------------------------
    // getName: Return the student's name
    //-----------------------------------------------
    public String getName() {
        return name;
    }
}
