package example.lesson16.bank;

public class Account {
    public int balance;
    public int id;

    public Account(int balance){
        this.balance = balance;
    }
    public void withdraw(int amout){
        System.out.println("withdraw");
        balance -= amout;
    }
    public void deposit (int amout){
        System.out.println("deposit");
        balance -= amout;
    }
    public int getBalance(){
        return balance;
    }
}
