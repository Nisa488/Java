package lab_2;

import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		        final int COVERAGE = 350;  
		        final int DOOR_AREA = 20; 
		        final int WINDOW_AREA = 15; 

		        int length, width, height; 
		        int numDoors, numWindows;
		        double totalSqFt, paintNeeded;

		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the length of the room (in feet): ");
		        length = input.nextInt();

		        System.out.print("Enter the width of the room (in feet): ");
		        width = input.nextInt();

		        System.out.print("Enter the height of the room (in feet): ");
		        height = input.nextInt();

		        System.out.print("Enter the number of doors: ");
		        numDoors = input.nextInt();

		        System.out.print("Enter the number of windows: ");
		        numWindows = input.nextInt();

		        totalSqFt = 2 * (length * height) + 2 * (width * height);

		        totalSqFt -= (numDoors * DOOR_AREA + numWindows * WINDOW_AREA);

		        paintNeeded = totalSqFt / COVERAGE;

		        System.out.printf("To paint the room with dimensions %d x %d x %d (L x W x H),\n", length, width, height);
		        System.out.printf("you will need %.2f gallons of paint.\n", paintNeeded);

		        input.close();


	}

}
