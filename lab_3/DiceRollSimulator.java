package lab_3;

import java.util.Random;

public class DiceRollSimulator {

	public static void main(String[] args) {
		Random random = new Random();
        
        int die1 = random.nextInt(6) + 1;
        
        int die2 = random.nextInt(6) + 1;
        
        int totalRoll = die1 + die2;

        // Print the results
        System.out.println("Results of the Dice Roll:");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total Roll: " + totalRoll);

	}

}
