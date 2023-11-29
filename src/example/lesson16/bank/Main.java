package example.lesson16.bank;

public class Main {
    static void transfer(Account account1, Account account2, int amout) throws InterruptedException {
        if(account1.getBalance() < amout){
            throw new RuntimeException("Can't be sent");
        }
        synchronized (account1){
            Thread.sleep(100);
            synchronized (account2){
                Thread.sleep(100);
            }
        }
        account1.withdraw(amout);
        account2.deposit(amout);
    }

    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account(1000);
        Account account2 = new Account(2000);

        new Thread(() -> {
            try {
                transfer(account1, account2, 500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        transfer(account2, account1, 200);
    }
}
