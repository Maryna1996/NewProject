package homework.hom2;

public abstract class Animal {
    private String name;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}