package example.lesson25;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try(FileInputStream fileInputStream = new FileInputStream("account.txt")) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                Account account = (Account) objectInputStream.readObject();
                System.out.println(account.getId());
                System.out.println(account.getFirstName());
                System.out.println(account.getSecondName());
            }
        }
    }
}
