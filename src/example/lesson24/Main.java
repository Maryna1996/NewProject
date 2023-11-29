package example.lesson24;

public class Main {
    public static void main(String[] args) {
        final Account account1 = Account.newBuilder().id(1).firstName("123").secondName("456").build();
        final Account account2 = Account.newBuilder().id(1).firstName("123").build();
        final Account account3 = Account.newBuilder().firstName("123").secondName("456").build();
        final Account account4 = Account.newBuilder().build();
    }
}
