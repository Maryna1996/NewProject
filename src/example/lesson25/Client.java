package example.lesson25;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Hello world!
 */
public class Client {
    public static void main(String[] args) throws IOException {
//        try (Socket socketClient = new Socket("localhost", 1111)) {
//            try (PrintWriter printWriter = new PrintWriter(socketClient.getOutputStream(), true)) {
//                Scanner sc = new Scanner(System.in);
//                while (sc.hasNextLine()) {
//                    printWriter.println(sc.next());
//                }
//            }
//        }

        try (Socket socketClient = new Socket("localhost", 1111)) {

            try (ObjectOutputStream objectOutputStream  = new ObjectOutputStream(socketClient.getOutputStream())){
                final Account account =
                        Account.newBuilder().id(1).firstName("tttt").secondName("eeeee").build();

                objectOutputStream.writeObject(account);
                objectOutputStream.flush();
            }

        }
    }
}
