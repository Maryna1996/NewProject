package example.lesson23.proxy;


import java.util.HashMap;
import java.util.Map;

public class MySQLProxyAccountDAO implements AccountDAO {

    private MySQLAccountDAO mySQLAccountDAO;
    private Map<Integer, Account> accountCache = new HashMap<>();


    public MySQLProxyAccountDAO(MySQLAccountDAO mySQLAccountDAO) {
        this.mySQLAccountDAO = mySQLAccountDAO;
    }

    @Override
    public Account getAccountById(int id) {
        if (!accountCache.containsKey(id)) {
            accountCache.put(id, mySQLAccountDAO.getAccountById(id));
        }
        return accountCache.get(id);
    }
}
