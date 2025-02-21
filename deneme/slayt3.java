package deneme;

public class slayt3 {
	public static void main(String[] args) {
		System.out.println("The 1. example:");
		String title = new String("Java Software Solution");
		System.out.println(title);
		System.out.println("-----------------------------------------");
		
		System.out.println("The 2. example:");
		int numChars = title.length();
		System.out.println(numChars);
		System.out.println("-----------------------------------------");
		
		System.out.println("The 3. example:");
		int num1 = 8;
		int num2 = 4;
		num1 = num2;
		System.out.println(num1 + "-" + num2);
		System.out.println("-----------------------------------------");
		
		System.out.println("The 3. example:");
		String example = "String";
		System.out.println(example);
		System.out.println("-----------------------------------------");
		
		System.out.println("The 4. example:");
		String phrase = "Change is inevitable";
	    String mutation1, mutation2, mutation3, mutation4;
	    System.out.println("Original string: \"" + phrase + "\"");
	    System.out.println("Length of string: " + phrase.length());
	    mutation1 = phrase.concat(", except from vending machines.");
	    mutation2 = mutation1.toUpperCase();
	    mutation3 = mutation2.replace('E', 'X');
	    mutation4 = mutation3.substring(3, 30);
	    System.out.println("Mutation #1: " + mutation1);
	    System.out.println("Mutation #2: " + mutation2);
	    System.out.println("Mutation #3: " + mutation3);
	    System.out.println("Mutation #4: " + mutation4);
	    System.out.println("Mutated length: " + mutation4.length());

	}

}
