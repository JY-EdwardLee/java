package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(50);
        System.out.println(account.getBalance());
        account.withdraw(100);
    }
}
