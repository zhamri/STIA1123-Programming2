package my.zhamri.stia1123;

public class CurrentAccount extends BankAccount{
    private double transactionFee;

    public CurrentAccount(String accountNumber, double balance, double transactionFee) {
        super(accountNumber, balance);
        this.transactionFee = transactionFee;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public static void main(String[] args) {
        BankAccount[] acctList = new BankAccount[3];
        acctList[0] = new BankAccount("1010-100", 500.00);
        acctList[1] = new CurrentAccount("1036-305", 500.00, 5.00);
        acctList[2] = new CurrentAccount("1043-305", 800.00, 3.00);

        int count = 0;
        for (int i = 0; i < acctList.length; i++) {
            if (acctList[i] instanceof CurrentAccount){
                count++; // count the number of CurrentAccount objects
            }
        }
        System.out.println("Number of CurrentAccount objects: " + count);

        CurrentAccount c = (CurrentAccount) acctList[2];
        System.out.println(c.getTransactionFee());

        System.out.println(((CurrentAccount) acctList[2]).getTransactionFee());
    }
}
