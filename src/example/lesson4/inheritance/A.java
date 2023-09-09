package example.lesson4.inheritance;

public class A {


    static {
        System.out.println("Static Block init A");
    }


    {
        System.out.println("Block init A");
    }

    public A() {
        System.out.println(" I'm A");
    }
}
