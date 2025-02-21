package assignment_1;

import java.util.Scanner;

public class FibonacciNumbers {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Please enter a positive number.");
            return; 
        }
        int a = 0; 
        int b = 1; 
        int index = 0; 
        if (inputNumber == 0) {
            System.out.println("The nearest Fibonacci number is 0; "
            		+ "Index: 0.");
            return; 
        }
        if (inputNumber == 1) {
            System.out.println("The nearest Fibonacci number is 1; "
            		+ "Indices: 1 and 2.");
            return; 
        }
        while (b < inputNumber) {
            int next = a + b; 
            a = b; 
            b = next; 
            index++; 
        }
        index++; 
        if (b < inputNumber) {
            System.out.println("The nearest Fibonacci number is " 
            		+ b + "; Index: " + index + ".");
        } else {
            if (inputNumber - a < b - inputNumber) {
                System.out.println("The nearest Fibonacci number is " 
                		+ a + "; Index: " + (index - 1) + ".");
            } else {
                System.out.println("The nearest Fibonacci number is " 
                		+ b + "; Index: " + index + ".");
            }
        }
        scanner.close();
    }
 }
