
public abstract class Account {

    // account number
    private int accountNumber;

    // Balance
    protected double balance; 

    // Default constructor
    public Account() {

    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0; 
    }

    // Getter methods
    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    // Abstract
      
    public abstract void withdraw(double amount); 
}



