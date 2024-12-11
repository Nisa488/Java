package lab_2;

import java.util.Scanner;

public class IdealWeight {

	public static void main(String[] args) {
		        int feet, inches;
		        int totalInches;
		        double femaleIdealWeight, maleIdealWeight;
		        double femaleMinWeight, femaleMaxWeight;
		        double maleMinWeight, maleMaxWeight;

		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter your height in feet: ");
		        feet = input.nextInt();
		        System.out.print("Enter the additional inches: ");
		        inches = input.nextInt();

		        totalInches = (feet * 12) + inches;

		        femaleIdealWeight = 100 + 5 * (totalInches - 60);
		        maleIdealWeight = 106 + 6 * (totalInches - 60);

		        femaleMinWeight = femaleIdealWeight - (femaleIdealWeight * 0.15);
		        femaleMaxWeight = femaleIdealWeight + (femaleIdealWeight * 0.15);
		        maleMinWeight = maleIdealWeight - (maleIdealWeight * 0.15);
		        maleMaxWeight = maleIdealWeight + (maleIdealWeight * 0.15);

		        System.out.printf("For a female with height %d' %d\":\n", feet, inches);
		        System.out.printf("Ideal weight: %.2f pounds\n", femaleIdealWeight);
		        System.out.printf("Acceptable weight range: %.2f to %.2f pounds\n", femaleMinWeight, femaleMaxWeight);

		        System.out.printf("\nFor a male with height %d' %d\":\n", feet, inches);
		        System.out.printf("Ideal weight: %.2f pounds\n", maleIdealWeight);
		        System.out.printf("Acceptable weight range: %.2f to %.2f pounds\n", maleMinWeight, maleMaxWeight);

		        input.close();


	}

}