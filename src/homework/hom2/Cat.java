package homework.hom2;

class Cat extends Animal {
    private static int count = 0;

    public Cat(String name) {
        super(name);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " run " + distance + " м");
        } else {
            System.out.println(getName() + " cannot run such a distance");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " cannot swim");
    }
}
