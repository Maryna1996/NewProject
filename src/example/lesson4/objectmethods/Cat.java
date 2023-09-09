package example.lesson4.objectmethods;

public class Cat {
    private static int count = 0;

    public Cat() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
