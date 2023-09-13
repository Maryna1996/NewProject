package homework.hom11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToListConverter {
    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list,array);
        return list;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        List<Integer> list = toList(array);
        System.out.println(list);
    }
}