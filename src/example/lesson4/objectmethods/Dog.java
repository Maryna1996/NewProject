package example.lesson4.objectmethods;

public class Dog {
    private static int count = 0;

    public Dog() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
