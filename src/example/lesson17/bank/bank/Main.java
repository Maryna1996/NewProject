package example.lesson17.bank.bank;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

//    static void transfer(Account account1, Account account2, int amount) throws InterruptedException {
//
//        if (account1.getBalance() < amount) {
//            throw new RuntimeException("Can't be sent");
//        }
//        System.out.println("Trying to lock account " + account1);
//        synchronized (account1) {
//            Thread.sleep(100);
//            System.out.println("Account is locked "+account1);
//            System.out.println("Trying to lock account " + account2);
//            synchronized (account2) {
//                System.out.println("Account is locked "+account2);
//                Thread.sleep(100);
//                account1.withdraw(amount);
//                account2.deposit(amount);
//                System.out.println("Money transfer was successfully");
//            }
//        }
//    }


    static void transfer(Account account1, Account account2, int amount) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();

        if (account1.getBalance() < amount) {
            throw new RuntimeException("Can't be sent");
        }
        System.out.println("Trying to lock account " + account1);
        try {
            if (account1.getLock().tryLock()) {
                System.out.println("Account is locked " + account1);
                System.out.println("Trying to lock account " + account2);
                try {
                    if (account2.getLock().tryLock(100, TimeUnit.MILLISECONDS)) {
                        System.out.println("Account is locked " + account2);
                        account1.withdraw(amount);
                        account2.deposit(amount);
                        System.out.println("Money transfer was successfully");
                    } else {
                        System.out.println("Can't get a lock "+account2);
                        account2.getFailedTransactionCount().incrementAndGet();
                    }
                }
                finally {
                    if (account2.getLock().isHeldByCurrentThread()) {
                        account2.getLock().unlock();
                    }
                }
            } else {
                System.out.println("Can't get a lock "+account1);
                account1.getFailedTransactionCount().incrementAndGet();

            }
        }
        finally {
            if (account1.getLock().isHeldByCurrentThread()) {
                account1.getLock().unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account(1000, 1);
        Account account2 = new Account(2000, 2);

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
