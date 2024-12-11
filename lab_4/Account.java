package lab_4;

public class Account {
    private double balance;  // Hesap bakiyesi
    private String name;     // Hesap sahibinin adı
    private long acctNum;    // Hesap numarası

    //----------------------------------------------
    // Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount) {
        balance += amount;
    }

    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public double getBalance() {
        return balance;
    }

    //----------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //----------------------------------------------
    public String toString() {
        return "Account holder: " + name +
               ", Account number: " + acctNum +
               ", Balance: $" + balance;
    }

    //----------------------------------------------
    // Deducts $10 service fee.
    //----------------------------------------------
    public void chargeFee() {
        balance -= 10;
    }

    //----------------------------------------------
    // Changes the name on the account
    //----------------------------------------------
    public void changeName(String newName) {
        name = newName;
    }
}