class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    public void setAccountNumber(String number) {
        accountNumber = number;
    }

    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for account holder
    public void setAccountHolder(String holder) {
        accountHolder = holder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double amount) {

        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Deposit
    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid deposit.");
        }
    }

    // Withdraw
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Invalid withdrawal.");
        }
    }

    // Method for polymorphism
    public double calculateCharges() {
        return 0;
    }
}


class SavingsAccount extends BankAccount {

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    @Override
    public double calculateCharges() {
        return getBalance() * 0.01;
    }
}


class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double limit) {
        overdraftLimit = limit;
    }

    @Override
    public double calculateCharges() {
        return 50;
    }
}


public class Main {

    public static void main(String[] args) {

        // Create Savings Account
        SavingsAccount savings = new SavingsAccount();

        savings.setAccountNumber("S001");
        savings.setAccountHolder("Ali");
        savings.setBalance(10000);
        savings.setInterestRate(5);

        savings.deposit(2000);
        savings.withdraw(1000);

        System.out.println("Savings Account");
        System.out.println("Account Number: " + savings.getAccountNumber());
        System.out.println("Account Holder: " + savings.getAccountHolder());
        System.out.println("Balance: " + savings.getBalance());
        System.out.println("Interest Rate: " + savings.getInterestRate());
        System.out.println("Charges: " + savings.calculateCharges());


        System.out.println();


        // Create Current Account
        CurrentAccount current = new CurrentAccount();

        current.setAccountNumber("C001");
        current.setAccountHolder("Ahmed");
        current.setBalance(15000);
        current.setOverdraftLimit(5000);

        current.deposit(3000);
        current.withdraw(2000);

        System.out.println("Current Account");
        System.out.println("Account Number: " + current.getAccountNumber());
        System.out.println("Account Holder: " + current.getAccountHolder());
        System.out.println("Balance: " + current.getBalance());
        System.out.println("Overdraft Limit: " + current.getOverdraftLimit());
        System.out.println("Charges: " + current.calculateCharges());


        System.out.println();


        // Runtime Polymorphism

        BankAccount account;

        account = new SavingsAccount();

        System.out.println("Polymorphism - Savings Account Charges:");
        System.out.println(account.calculateCharges());

        account = new CurrentAccount();

        System.out.println("Polymorphism - Current Account Charges:");
        System.out.println(account.calculateCharges());
    }
}
