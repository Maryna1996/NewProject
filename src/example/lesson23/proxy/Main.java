package example.lesson23.proxy;

public class Main {


    public static void main(String[] args) {
        MySQLAccountDAO mySQLAccountDAO = new MySQLAccountDAO();


        MySQLProxyAccountDAO proxy = new MySQLProxyAccountDAO(mySQLAccountDAO);


        System.out.println("proxy");
        for (int i = 0; i < 10; i++) {
            System.out.println(proxy.getAccountById(1));
            System.out.println(proxy.getAccountById(2));
            System.out.println(proxy.getAccountById(3));
        }



        System.out.println("direct");
        for (int i = 0; i < 10; i++) {
            System.out.println(mySQLAccountDAO.getAccountById(1));
            System.out.println(mySQLAccountDAO.getAccountById(2));
            System.out.println(mySQLAccountDAO.getAccountById(3));
        }
    }
}