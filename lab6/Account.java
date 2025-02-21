package lab6;

import java.util.Random;

public class Account {
    private double balance;
    private String name;
    private long acctNum;

    // Constructor: initializes balance, owner, and account number
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    // Constructor: initializes balance and owner; generates a random account number
    public Account(double initBal, String owner) {
        balance = initBal;
        name = owner;
        acctNum = generateRandomAccountNumber();
    }

    // Constructor: initializes only owner; balance is set to 0, generates random account number
    public Account(String owner) {
        balance = 0;
        name = owner;
        acctNum = generateRandomAccountNumber();
    }

    // Private method to generate a random account number
    private long generateRandomAccountNumber() {
        Random rand = new Random();
        return 1000000000L + rand.nextLong(9000000000L);  // Random 10-digit number
    }

    // Method: withdraws amount from account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Overloaded withdraw method: withdraws amount and deducts a fee
    public void withdraw(double amount, double fee) {
        double totalAmount = amount + fee;
        if (balance >= totalAmount) {
            balance -= totalAmount;
        } else {
            System.out.println("Insufficient funds for withdrawal and fee");
        }
    }

    // Method: deposits amount to the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method: returns the account balance
    public double getBalance() {
        return balance;
    }

    // Method: returns a string representation of the account details
    public String toString() {
        return "Name: " + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
    }

	public static String getNumAccounts() {
		// TODO Auto-generated method stub
		return null;
	}
}
