package homework.hom6;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());

        System.out.println("Weight appleBox1: " + appleBox1.getWeight());
        System.out.println("Weight appleBox2: " + appleBox2.getWeight());
        System.out.println("Weight orangeBox: " + orangeBox.getWeight());

        System.out.println("appleBox1 = appleBox2: " + appleBox1.compare(appleBox2));
        System.out.println("appleBox1 = orangeBox: " + appleBox1.compare(orangeBox));

        appleBox1.merge(appleBox2);
        System.out.println("Weight appleBox1 after unification: " + appleBox1.getWeight());
    }
}