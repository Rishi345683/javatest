package main;

import java.util.Scanner;

import abstracts.Account;
import abstracts.ATM;
import security.AccountNumberGenerator;
import security.BankATM;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 Account number generated
        long accNo = AccountNumberGenerator.generateAccountNumber();

        // 🔐 User sets their own PIN
        System.out.print("Set your 4-digit PIN: ");
        int pin = sc.nextInt();

        // 🔹 Create account with user PIN
        Account account = new Account(accNo, pin, 10000);
        ATM atm = new BankATM(account);

        System.out.println("\nAccount Created Successfully!");
        System.out.println("Account Number: " + accNo);

        // 🔐 PIN verification
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (!account.validatePin(enteredPin)) {
            System.out.println("Wrong PIN. Access denied.");
            sc.close();
            return;
        }

        System.out.println("PIN Verified ✅");

        // ✅ ATM menu starts
        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Bank Statement");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    atm.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    atm.withdraw(sc.nextDouble());
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    ((BankATM) atm).showStatement();
                    break;

                case 5:
                    sc.close();
                    atm.exit();
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
