package assignment_1;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a 10-digit phone number: ");
        String phoneNumber = scanner.nextLine();

        String full = String.format("(%s) %s-%s", 
                phoneNumber.substring(0, 3), 
                phoneNumber.substring(3, 6), 
                phoneNumber.substring(6));

        String local = String.format("%s-%s", 
                phoneNumber.substring(3, 6), 
                phoneNumber.substring(6));

        String campus = String.format("%s-%s", 
                phoneNumber.charAt(5), 
                phoneNumber.substring(6));

        System.out.println("Full: " + full);
        System.out.println("Local: " + local);
        System.out.println("Campus: " + campus);
        scanner.close();
	}

}