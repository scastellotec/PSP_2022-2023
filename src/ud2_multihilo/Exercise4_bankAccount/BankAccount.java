package ud2_multihilo.Exercise4_bankAccount;

public class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized int withDraw(int moneyTaken) throws InterruptedException {
        if (balance >= moneyTaken){
            Thread.sleep(1);
            balance -= moneyTaken;
            return moneyTaken;
        } else {
            return 0;
        }
    }
}
