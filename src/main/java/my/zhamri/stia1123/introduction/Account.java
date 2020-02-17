package my.zhamri.stia1123.introduction;

public class Account {
    private double balance;

    public Account() {
        this.balance = 100;
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount);
        checkBalance();
    }

    public void withdrawMoney(double amount) {
        System.out.println("Withdraw: " + amount);
        if (balance - amount < 0) {
            System.out.println("Not enough money ...");
            checkBalance();
        } else {
            balance -= amount;
            System.out.println("Please take your money ...");
            checkBalance();
        }
    }
}
