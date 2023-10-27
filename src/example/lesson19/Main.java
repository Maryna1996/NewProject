package example.lesson19;

import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        File file = new File("Test.txt");
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        file.createNewFile();


// 1       FileInputStream fis = null;
//        try {
//            fis = new FileInputStream(file);
//            int i;
//            while ((i = fis.read()) != -1) {
//                System.out.println((char)i);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            fis.close();
//        }


        //2
//        try (FileInputStream fis = new FileInputStream(file)) {
//            int i;
//            while ((i = fis.read()) != -1) {
//                System.out.println((char) i);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //3
//        try (FileReader fis = new FileReader(file)) {
//            int i;
//            while ((i = fis.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        //4
//        try (BufferedReader fis = new BufferedReader(new FileReader(file))) {
//            int i;
//            while ((i = fis.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //5
        try (BufferedReader fis = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = fis.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //6
        try (BufferedWriter fis = new BufferedWriter(new FileWriter(file, true))) {
            fis.write("1231231231231");
            fis.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //7
//        try (PrintWriter fis = new PrintWriter(file)) {
////            fis.write("123123213\n");
//            fis.append("dfsfsdfsf");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        //8
        try (DataOutputStream fis = new DataOutputStream(new FileOutputStream("double.txt"))) {
            fis.writeDouble(2.5);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //9
        try (DataInputStream fis = new DataInputStream(new FileInputStream("double.txt"))) {
            System.out.println(fis.readDouble());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}