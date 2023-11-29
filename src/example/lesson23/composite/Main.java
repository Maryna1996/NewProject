package example.lesson23.composite;

import com.google.common.collect.ImmutableList;

public class Main {


    public static void main(String[] args) {
        CompositeElement compositeElement = new CompositeElement(
                new Box(ImmutableList.of(new Product(23), new Product(45))),
                new Product(333),
                new Product(55)
        );

        System.out.println(compositeElement.getPrice());
    }
}
