package example.lesson4.objectmethods;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());

    }
}
