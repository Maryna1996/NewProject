package homework.coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
        nextOrderNumber = 1;
    }

    public void add(Order order) {
        order.setOrderNumber(nextOrderNumber);
        nextOrderNumber++;
        orders.add(order);
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order nextOrder = orders.get(0);
            System.out.println("Delivering order: Num " + nextOrder.getOrderNumber() + " | Name " + nextOrder.getCustomerName());
            orders.remove(0);
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNumber) {
                Order deliveredOrder = orders.get(i);
                System.out.println("Delivering order: Num " + deliveredOrder.getOrderNumber() + " | Name " + deliveredOrder.getCustomerName());
                orders.remove(i);
                return;
            }
        }
        System.out.println("Order with number " + orderNumber + " not found.");
    }

    public void draw() {
        System.out.println("============= \nNum | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
        }
    }
}

