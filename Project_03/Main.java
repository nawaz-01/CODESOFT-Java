package Project_03;

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(5000.00); // starting with $5000
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
