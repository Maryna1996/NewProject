package example.lesson25;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writer {


    public static void main(String[] args) throws IOException {
        final Account account = Account.newBuilder().id(1).firstName("firstName").secondName("secondName").build();



        try (FileOutputStream fileOutputStream = new FileOutputStream("account.txt")){
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(account);
            }
        }



    }
}
