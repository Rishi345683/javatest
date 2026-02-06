package abstracts;

public class Account {

    private long accountNumber;
    private int pin;
    private double balance;

    public Account(long accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // ✅ PIN validation
    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
