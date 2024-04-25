package my.zhamri.stia1123.myException;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
//    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount. The amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance is " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    // Other methods like deposit, getBalance...
}