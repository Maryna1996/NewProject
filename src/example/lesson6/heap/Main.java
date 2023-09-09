package example.lesson6.heap;

import java.util.ArrayList;
import java.util.List;

    public class Main {


        public static void main(String[] args) throws InterruptedException {


//        Runtime.getRuntime().gc();


            List<Object> list = new ArrayList<>();

            while(true)
            {
                Object o = new Object();
                list.add(o);
            }
        }
}
