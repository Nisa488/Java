package deneme;

import java.util.Scanner;

public class slayt2 {

	public static void main(String[] args) {
		System.out.println("The 1. example:");
		System.out.println(25 + 48 + " let's see the result ");
		System.out.println(25 + " let's see the another result " + 48);
		System.out.println(" let's see the last result " + 25 + 48);
		System.out.println("-----------------------------------------");
		
		System.out.println("The 2. example:");
		System.out.println("I said \"Hello\" to you.");
		System.out.println("I said \'Hello\' to you.");
		System.out.println("I said \bHello to you.");
		System.out.println("I said \tHello\t to you.");
		System.out.println("I said \nHello\n to you.");
		System.out.println("I said \rHello\r to you.");
		System.out.println("I said \\Hello\\ to you.");
		System.out.println(".........................");
		
		System.out.println("Roses are red,\n\tViolets are blue,\n" +
		         "Sugar is sweet,\n\tBut I have \"commitment issues\",\n\t" +
		         "So I'd rather just be friends\n\tAt this point in our " +
		         "relationship.");
		
		System.out.println("------------------------");
		
		System.out.println("The 3. example:");
		System.out.println("\"Thank you all for " +
				   "coming to my home\ntonight,\" he said " +
				   "mysteriously.");
		System.out.println("------------------------");
		
		System.out.println("The 4. example:");
		int a = 4, b = 8;
		System.out.println(a + " is the partner of " + b + ".");
		System.out.println("------------------------");
		
		System.out.println("The 5. example:");
		String total = "Family";
		System.out.println(total + " is " + a + " plus " + b +".");
		System.out.println("------------------------");
		
		System.out.println("The 6. example:");
		System.out.println(3%10);
		int count = 1;
		count = count + 1;
		count++;
		++count;
		System.out.println(count);
		System.out.println("------------------------");
		
		System.out.println("The 7. example:");
		int number=10;
		number++;
		System.out.println("Number is " + number++);
		System.out.println("New number is " + number);
		System.out.println("Number is "+ ++number);
		System.out.println("------------------------");
		
		System.out.println("The 8. example:");
		int total2 = 50;
		float result = (float) total2;
		System.out.println(result);
		System.out.println("------------------------");
		
		System.out.println("The 8. example:");
		String message;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a line of text:");
			message = scan.nextLine();
		}
		System.out.println("You entered: \"" + message + "\"");
		System.out.println("------------------------");
		
		System.out.println("The 9. example:");
		System.out.print("Three... ");
		System.out.print("Two... ");
		System.out.print("One... ");
		System.out.print("Zero... ");
		System.out.println("Liftoff!");
		System.out.print("Houston, we have a problem.");

		   

	}

}
