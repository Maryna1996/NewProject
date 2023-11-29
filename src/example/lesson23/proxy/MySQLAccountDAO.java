package example.lesson23.proxy;
import com.google.common.collect.ImmutableMap;


import java.util.Map;

public class MySQLAccountDAO implements AccountDAO {
    @Override
    public Account getAccountById(int id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return db().get(id);
    }


    private Map<Integer, Account> db() {
        return ImmutableMap.of(1, new Account(1, "Alex"),
                2, new Account(2, "Vlad"),
                3, new Account(3, "Timur"));
    }
}