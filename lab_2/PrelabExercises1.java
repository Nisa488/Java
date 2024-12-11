package lab_2;

import java.util.Scanner;
public class PrelabExercises1 {

	public static void main(String[] args) {
	    int val1, val2, val3; 
	    double average; 
	    Scanner scan = new Scanner(System.in); 
	    
	    System.out.println("Please enter three integers and " + 
	                       "I will compute their average"); 
	    val1 = scan.nextInt();   
	    val2 = scan.nextInt();   
	    val3 = scan.nextInt();    
	    
	    average = (val1 + val2 + val3) / 3.0; 
	     
	    System.out.println("The average is: " + average); 
	    
	    scan.close();
	}

}
