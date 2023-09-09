package homework.hom2;

class Dog extends Animal {
    private static int count = 0;

    public Dog(String name) {
        super(name);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(getName() + " run " + distance + " м");
        } else {
            System.out.println(getName() + " cannot run such a distance");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(getName() + " swam " + distance + " м");
        } else {
            System.out.println(getName() + " cannot swim that distance");
        }
    }
}