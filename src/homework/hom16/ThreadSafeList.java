package homework.hom16;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList<T> {
    private List<T> list = new ArrayList<>();

    public synchronized void add(T element) {
        list.add(element);
    }

    public synchronized void remove(T element) {
        list.remove(element);
    }

    public synchronized T get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        return null; // You can define how to handle invalid indexes as you wish
    }
}





