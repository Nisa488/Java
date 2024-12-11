package exercise;

import java.util.Scanner;
public class exercise4_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first floating point value: ");
        float num1 = scanner.nextFloat();
        
        System.out.print("Enter the second floating point value: ");
        float num2 = scanner.nextFloat();
        
        System.out.print("Enter the tolerance value: ");
        float tolerance = scanner.nextFloat();
        
        boolean result = areEqualWithinTolerance(num1, num2, tolerance);

        System.out.println(result);
        
        scanner.close();
    }

    public static boolean areEqualWithinTolerance(float a, float b, float tolerance) {

        return Math.abs(a - b) <= tolerance;
	}

}