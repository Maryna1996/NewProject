package example.lesson12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.add("E");
//
//        final Iterator<String> interator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer integer : list){
            if (integer.equals(3)){
                list.remove(integer);

            }

        }

    }
}
