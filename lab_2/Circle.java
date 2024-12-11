package lab_2;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		final double PI = 3.14159; 
        int radius; 
        double area1, area2, circumference1, circumference2; 
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Please enter a value for the radius: "); 
        radius = scan.nextInt(); 
        
        area1 = PI * radius * radius; 
        circumference1 = 2 * PI * radius; 
        
        System.out.println("The area of a circle with radius " + radius + " is " + area1); 
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1); 
        
        radius *= 2; 
        
        area2 = PI * radius * radius; 
        circumference2 = 2 * PI * radius; 
        
        System.out.println("The area of a circle with radius " + radius + " is " + area2); 
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2); 
        
        double areaChange = area2 / area1; 
        double circumferenceChange = circumference2 / circumference1; 
        
        System.out.println("The area changed by a factor of: " + areaChange); 
        System.out.println("The circumference changed by a factor of: " + circumferenceChange); 
        
        scan.close();
	}

}