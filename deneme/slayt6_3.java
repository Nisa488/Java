package deneme;

import java.util.Scanner;

public class slayt6_3 {

	public static void main(String[] args) {
		System.out.println("The 1. example.");
		final int PER_LINE = 5;
	      int value, limit, mult, count = 0;
	      try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter a positive value: ");
			  value = scan.nextInt();
			  System.out.print("Enter an upper limit: ");
			  limit = scan.nextInt();
			  System.out.println();
			  System.out.println("The multiples of " + value + " between " +
			                   value + " and " + limit + " (inclusive) are:");
			  for (mult = value; mult <= limit; mult += value){
			     System.out.print(mult + "\t");
			     count++;
			     if (count % PER_LINE == 0)
			        System.out.println();
			  }
			  scan.close();
	      }
		System.out.println("\n-------------------------------------------------------");
		
		System.out.println("The 2. example.");
	      final int MAX_ROWS = 10;

	      for (int row = 1; row <= MAX_ROWS; row++)
	      {
	         for (int star = 1; star <= row; star++)
	            System.out.print("*");

	         System.out.println();
	      }
	      System.out.println("-------------------------------------------------------");
	   
	      System.out.println("The 3. example.");
	      Die die = new Die();
	      int count1 = 0;
	      for (int num=1; num <= 100; num++)
	         if (die.roll() == 3)
	            count1++;
	      System.out.println(count1);
	      System.out.println("-------------------------------------------------------");
	}

}
