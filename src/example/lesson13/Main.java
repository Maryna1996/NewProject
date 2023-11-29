package example.lesson13;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
//        Map<Key, String> map = new HashMap<>();
//
//        final Key key1 = new Key(1);
//        final Key key2 = new Key(2);
//        map.put(key1, "1");
//        map.put(key2, "2");
//
//
//        System.out.println(map.get(key1));


//        int limit = 30000;
//
//
//        Map<Key, String> mapWithoutC = new HashMap<>();
//        Map<IncorrectKey, String> mapWithC = new HashMap<>();
//
//        for (int i = 0; i < limit; i++) {
//            Key key = new Key(i);
//            mapWithoutC.put(key, "Str" + i);
//        }
//
//        for (int i = 0; i < limit; i++) {
//            IncorrectKey key = new IncorrectKey(i);
//            mapWithC.put(key, "Str" + i);
//        }
//
//        Main main = new Main();
//        main.benchmark(mapWithoutC, mapWithC);

//        Map<Key, String> map = new HashMap<>();
//        Key key = new Key(1);
//        Key key3 = new Key(3);
//        Key key4 = new Key(4);
//
//        map.put(key,"1");
//        map.put(key3,"3");
//        map.put(key4,"4");
//
//        for (Key key1 : map.keySet()) {
//            System.out.println(key1);
//        }
//
//        System.out.println("-------------------------");
//        for (String value : map.values()) {
//            System.out.println(value);
//        }
//
//        System.out.println("-------------------------");
//        for (Map.Entry<Key, String> keyStringEntry : map.entrySet()) {
//            System.out.println(keyStringEntry);
//            System.out.println(keyStringEntry.getKey());
//            System.out.println(keyStringEntry.getValue());
//        }


//        Main main = new Main();
//
//        System.out.println(main.getSpeed(AutoType.TESLA));
//        System.out.println(main.getSpeed(AutoType.MATIZ));
//        System.out.println(main.getSpeed(AutoType.TOYOTA));


        Map<Key, String> map = new TreeMap<>(Comparator.comparingInt(Key::getI));

    }


    public int getSpeed(AutoType autoType){
        return getData().get(autoType).getSpeed();
    }


    private Map<AutoType, Auto> getData(){
        Map<AutoType, Auto> map = new HashMap<>();

        map.put(AutoType.Tesla, new Tesla());
        map.put(AutoType.Matiz, new Matiz());
        map.put(AutoType.Toyota, new Toyota());

        return map;
    }


    public <T, R> void benchmark(Map<T, String> map1, Map<R, String> map2) {
        long start = System.nanoTime();

        for (T t : map1.keySet()) {
            map1.get(t);
        }

        final long result = System.nanoTime() - start;

        System.out.println("Get element without collisions: " + result / 1000000 + " ms");


        long start2 = System.nanoTime();

        for (R t : map2.keySet()) {
            map2.get(t);
        }

        final long result2 = System.nanoTime() - start2;

        System.out.println("Get element with collisions: " + result2 / 1000000 + " ms");
    }
}
