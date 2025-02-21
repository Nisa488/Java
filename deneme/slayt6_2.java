package deneme;

import java.util.Scanner;

public class slayt6_2 {

	public static void main(String[] args) {
		System.out.println("The 1. example:");
	      int number, lastDigit, reverse = 0;
	      Scanner scan1 = new Scanner(System.in);
	      System.out.print("Enter a positive integer: ");
	      number = scan1.nextInt();
	      do
	      {
	         lastDigit = number % 10;
	         reverse = (reverse * 10) + lastDigit;
	         number = number / 10;
	      }
	      while (number > 0);
	      System.out.println("That number reversed is " + reverse);
	      scan1.close();
	      System.out.println("-----------------------------------------");
	      
	      System.out.println("The 2. example:");
	      for (int count=1; count <= 5; count++)
			   System.out.println(count);
	      System.out.println("-----------------------------------------");
	      
	      System.out.println("The 3. example:");
	      for (int num=100; num >= 0; num -= 5)
			   System.out.println(num);
	      System.out.println("-----------------------------------------");
	}

}
