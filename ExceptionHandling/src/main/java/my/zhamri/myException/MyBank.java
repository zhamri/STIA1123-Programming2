package my.zhamri.myException;

class MyBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);
        try {
            account.withdraw(1200.00);
//            account.withdraw(-1200.00);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
    }
}

