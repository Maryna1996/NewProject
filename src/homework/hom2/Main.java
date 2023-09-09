package homework.hom2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Richie");
        Cat cat2 = new Cat("Malvina");

        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Gilda");

        cat1.run(200);
        cat1.swim(3);

        cat2.run(180);
        cat2.swim(1);

        dog1.run(500);
        dog1.swim(11);

        dog2.run(600);
        dog2.swim(10);

        System.out.println(" Number of created cats: " + Cat.getCount());
        System.out.println(" Number of dogs created: " + Dog.getCount());
        System.out.println(" Number of animals created: " + Animal.getCount());
    }
}