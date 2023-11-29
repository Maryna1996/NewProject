package example.lesson25;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

//        try (ServerSocket serverSocket = new ServerSocket(1111)) {
//            while (true) {
//                final Socket accept = serverSocket.accept();
//
//                new Thread(() -> {
//                    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()))) {
//                        String message;
//                        while ((message = bufferedReader.readLine()) != null) {
//                            System.out.println(message);
//                        }
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }).start();
//            }
//        }


        try (ServerSocket serverSocket = new ServerSocket(1111)) {
            while (true) {
                final Socket accept = serverSocket.accept();

                new Thread(() -> {
                    try (ObjectInputStream objectInputStream = new ObjectInputStream(accept.getInputStream())) {
                        Account account;

                        while ((account = (Account) objectInputStream.readObject()) !=null) {
                            System.out.println(account.getId());
                            System.out.println(account.getFirstName());
                            System.out.println(account.getSecondName());
                        }

                    }catch (EOFException e) {
                        System.out.println("end stream");
                    }
                    catch (IOException | ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }).start();
            }
        }
    }
}
