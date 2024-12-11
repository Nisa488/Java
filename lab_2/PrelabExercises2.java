package lab_2;

import java.util.Scanner;

public class PrelabExercises2 {

	public static void main(String[] args) {
		String Name;  
	    int number; 
	    int numSq; 
	    Scanner scan = new Scanner(System.in); 
	    System.out.print("Enter your name, please: "); 
	    Name = scan.next(); 
	    System.out.print("What is your favorite number? "); 
	    number = scan.nextInt(); 
	    numSq = number * number; 
	    System.out.println(Name + ", the square of your number is " + numSq);
	    scan.close();
	}

}
