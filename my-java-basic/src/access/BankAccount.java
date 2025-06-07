package access;

public class BankAccount {

    private int balance; // 데이터(속성) 접근 막기

    public BankAccount() {
        this.balance = 0;
    }

    // public method 입금
    public void deposit(int amount) {
        // amount가 이상하면 검증하자
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효한 금액 입력");
        }
    }
    // public 출금
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("다시 입력");
        }
    }
    // public 잔액조회
    public int getBalance() {
        return balance;
    }
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
