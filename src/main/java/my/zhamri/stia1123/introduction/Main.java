package my.zhamri.stia1123.introduction;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.checkBalance();
        account.depositMoney(300);
        account.withdrawMoney(50);
        account.withdrawMoney(500);
        account.depositMoney(700);
    }
}

/***
 * Balance: 100.0
 * Deposit: 300.0
 * Balance: 400.0
 * Withdraw: 50.0
 * Please take your money ...
 * Balance: 350.0
 * Withdraw: 500.0
 * Not enough money ...
 * Balance: 350.0
 * Deposit: 700.0
 * Balance: 1050.0
 */

