package example.lesson4.inheritance;

public class B  extends A {


    static {
        System.out.println("Static Block init B");
    }


    {
        System.out.println("Block init B");
    }

    public B() {
        System.out.println("I'm B");
    }
}

