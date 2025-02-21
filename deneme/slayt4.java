package deneme;

public class slayt4 {

	public static void main(String[] args) {
		System.out.println("The 1. example:");
		Die die1, die2;
	      int sum;
	      die1 = new Die();
	      die2 = new Die();
	      die1.roll();
	      die2.roll();
	      System.out.println("Die One: " + die1 + ", Die Two: " + die2);
	      die1.roll();
	      die2.setFaceValue(4);
	      System.out.println("Die One: " + die1 + ", Die Two: " + die2);
	      sum = die1.getFaceValue() + die2.getFaceValue();
	      System.out.println("Sum: " + sum);
	      sum = die1.roll() + die2.roll();
	      System.out.println("Die One: " + die1 + ", Die Two: " + die2);
	      System.out.println("New sum: " + sum);
		System.out.println("-----------------------------------------");

		System.out.println("The 2. example:");
		Account acct1 = new Account("Ted Murphy", 72354, 102.56);
	    Account acct2 = new Account("Jane Smith", 69713, 40.00);
	    Account acct3 = new Account("Edward Demsey", 93757, 759.32);
	      acct1.deposit(25.85);
	      double smithBalance = acct2.deposit(500.00);
	      System.out.println("Smith balance after deposit: " +
	                          smithBalance);
	      System.out.println("Smith balance after withdrawal: " + 
                  acct2.withdraw (430.75, 1.50));
	      acct1.addInterest();
	      acct2.addInterest();
	      acct3.addInterest();
	      System.out.println();
	      System.out.println(acct1);
	      System.out.println(acct2);
	      System.out.println(acct3);
		System.out.println("-----------------------------------------");
	}
}
