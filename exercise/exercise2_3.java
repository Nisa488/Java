package exercise;

import java.util.Scanner;

public class exercise2_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		double radius = scanner.nextDouble();

		double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Perimeter (Circumference) of the circle: %.2f\n", perimeter);  

		        System.out.println("Area:" + (Math.PI*radius*2));
		        scanner.close();
	}
}
