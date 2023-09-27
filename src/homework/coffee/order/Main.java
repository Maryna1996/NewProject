package homework.coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        Order order1 = new Order("Alen");
        Order order2 = new Order("Yoda");
        Order order3 = new Order("Obi-van");
        Order order4 = new Order("John Snow");

        orderBoard.add(order1);
        orderBoard.add(order2);
        orderBoard.add(order3);
        orderBoard.add(order4);

        System.out.println("Initial order queue:");
        orderBoard.draw();

        System.out.println("\nDelivering orders:");
        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.deliver();
        orderBoard.deliver();

        System.out.println("\nUpdated order queue:");
        orderBoard.draw();

        System.out.println("\nDelivering order with number 3:");
        orderBoard.deliver(3);

        System.out.println("\nUpdated order queue:");
        orderBoard.draw();

        System.out.println("\nDelivering order with number 5:");
        orderBoard.deliver(5);
    }
}
