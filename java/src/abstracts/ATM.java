package abstracts;

public abstract class ATM {

    protected Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + account.getBalance());
    }

    public void exit() {
        System.out.println("Thank you! Visit again 😊");
        System.exit(0);
    }
}

