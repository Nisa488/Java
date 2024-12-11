package lab_4;

public class Grades {

	public static void main(String[] args) {
		 // Create student1 for "Mary"
        Student student1 = new Student("Mary");

        // Create student2 for "Mike"
        Student student2 = new Student("Mike");

        // Input grades for Mary
        student1.inputGrades();
        // Print average for Mary
        System.out.println("The average for " + student1.getName() + " is " + student1.getAverage());

        System.out.println(); // Just for a little space between outputs

        // Input grades for Mike
        student2.inputGrades();
        // Print average for Mike
        System.out.println("The average for " + student2.getName() + " is " + student2.getAverage());
	}

}

