package lab_2;

import java.util.Scanner;

public class LabGrade {

	public static void main(String[] args) {

		        double preLabEarned, postLabEarned, inClassEarned;
		        double preLabMax, postLabMax, inClassMax;
		        double outClassAverage, inClassAverage, labGrade;
		        double inWeight, outWeight;  

		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter points earned on pre-lab: ");
		        preLabEarned = input.nextDouble();
		        System.out.print("Enter maximum points for pre-lab: ");
		        preLabMax = input.nextDouble();

		        System.out.print("Enter points earned on post-lab: ");
		        postLabEarned = input.nextDouble();
		        System.out.print("Enter maximum points for post-lab: ");
		        postLabMax = input.nextDouble();

		        System.out.print("Enter points earned on in-class lab: ");
		        inClassEarned = input.nextDouble();
		        System.out.print("Enter maximum points for in-class lab: ");
		        inClassMax = input.nextDouble();

		        System.out.print("Enter weight (in decimal form, e.g., 0.6) for in-class work: ");
		        inWeight = input.nextDouble();
		        outWeight = 1.0 - inWeight;  

		        outClassAverage = ((preLabEarned + postLabEarned) / (preLabMax + postLabMax)) * 100;

		        inClassAverage = (inClassEarned / inClassMax) * 100;

		        labGrade = (outClassAverage * outWeight) + (inClassAverage * inWeight);

		        System.out.printf("Out-of-class average: %.2f%%\n", outClassAverage);
		        System.out.printf("In-class average: %.2f%%\n", inClassAverage);
		        System.out.printf("Final lab grade: %.2f\n", labGrade);

		        input.close();

	}

}
