package Project_03;

import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    System.out.println("\nThank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("\nInvalid option. Please try again.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\nATM MENU");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.print("\nEnter choice: ");
    }

    private void checkBalance() {
        System.out.printf("\nYour current balance is: $%.2f%n", account.getBalance());
    }

    private void withdraw() {
        System.out.print("\nEnter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (account.Withdraw(amount)) {
            System.out.println("\nWithdrawal successful.");
        } else {
            System.out.println("\nInsufficient balance or invalid amount.");
        }
    }

    private void deposit() {
        System.out.print("\nEnter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            account.Deposit(amount);
            System.out.println("\nDeposit successful.");
        } else {
            System.out.println("\nInvalid deposit amount.");
        }
    }
}
