package exercise;

import java.util.Scanner;

public class exercise2_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int input1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int input2 = scan.nextInt();

        System.out.println("The product of numbers " + (input1*input2));

        scan.close();
	}

}
