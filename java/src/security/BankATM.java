package security;

import java.util.ArrayList;
import java.util.List;

import abstracts.ATM;
import abstracts.Account;
import abstracts.Transaction;

public class BankATM extends ATM {

    private List<Transaction> history = new ArrayList<>();

    public BankATM(Account account) {
        super(account);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        account.setBalance(account.getBalance() + amount);
        history.add(new Transaction("Deposit", amount));
        System.out.println("₹" + amount + " deposited successfully");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > account.getBalance()) {
            System.out.println("Insufficient balance");
        } else {
            account.setBalance(account.getBalance() - amount);
            history.add(new Transaction("Withdraw", amount));
            System.out.println("₹" + amount + " withdrawn successfully");
        }
    }

    public void showStatement() {
        System.out.println("\n--- Bank Statement ---");
        if (history.isEmpty()) {
            System.out.println("No transactions found");
        } else {
            for (Transaction t : history) {
                System.out.println(t);
            }
        }
    }
}
