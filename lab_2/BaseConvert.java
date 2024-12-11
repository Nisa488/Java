package lab_2;

import java.util.Scanner;

public class BaseConvert {

	public static void main(String[] args) {

		        int base10Num, base, maxNumber;
		        int place0, place1, place2, place3;
		        String baseBNum = "";  

		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the base (between 2 and 9): ");
		        base = input.nextInt();
		        System.out.print("Enter the base-10 number: ");
		        base10Num = input.nextInt();

		        maxNumber = (int) Math.pow(base, 4) - 1;
		        System.out.println("The maximum number that can fit in 4 digits in base " + base + " is: " + maxNumber);

		        if (base10Num > maxNumber) {
		            System.out.println("The number is too large to fit in 4 digits for base " + base + ".");
		        } else {

		            place0 = base10Num % base;  
		            base10Num = base10Num / base;  

		            place1 = base10Num % base;
		            base10Num = base10Num / base;

		            place2 = base10Num % base;
		            base10Num = base10Num / base;

		            place3 = base10Num % base;
		            base10Num = base10Num / base;

		            baseBNum = Integer.toString(place3) + Integer.toString(place2) + Integer.toString(place1) + Integer.toString(place0);

		            System.out.println("The base " + base + " representation is: " + baseBNum);
		        }

		        input.close();
	}

}