package exercise;

import java.util.Scanner;

public class exercise4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        boolean result = isEvenlyDivisible(num1, num2);
        
        System.out.println(result);
        
        scanner.close();
    }

    public static boolean isEvenlyDivisible(int a, int b) {

        if (a == 0 || b == 0) {
            return false;
        }

        return (a % b == 0) || (b % a == 0);
	}

}