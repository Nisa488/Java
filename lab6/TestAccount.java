package lab6;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        String name;
        double balance;
        long acctNum;
        Account acct;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account holder's first name");
        name = scan.next();
        acct = new Account(name);  // Calls constructor with only name
        System.out.println("Account for " + name + ":");
        System.out.println(acct);

        System.out.println("\nEnter initial balance");
        balance = scan.nextDouble();
        acct = new Account(balance, name);  // Calls constructor with balance and name
        System.out.println("Account for " + name + ":");
        System.out.println(acct);

        System.out.println("\nEnter account number");
        acctNum = scan.nextLong();
        acct = new Account(balance, name, acctNum);  // Calls constructor with balance, name, and account number
        System.out.println("Account for " + name + ":");
        System.out.println(acct);

        System.out.print("\nDepositing 100 into account, balance is now ");
        acct.deposit(100);
        System.out.println(acct.getBalance());

        System.out.print("\nWithdrawing $25, balance is now ");
        acct.withdraw(25);
        System.out.println(acct.getBalance());

        System.out.print("\nWithdrawing $25 with $2 fee, balance is now ");
        acct.withdraw(25, 2);
        System.out.println(acct.getBalance());

        System.out.println("\nBye!");
    }
}

