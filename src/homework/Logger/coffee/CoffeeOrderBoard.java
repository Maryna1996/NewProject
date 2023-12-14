package homework.Loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.PriorityQueue;

public class CoffeeOrderBoard {
    private static final Logger LOGGER = LoggerFactory.getLogger(CoffeeOrderBoard.class);

    private final PriorityQueue<Order> orders = new PriorityQueue<>();

    public void add(String name) {
        LOGGER.info("Adding a new order for {}", name);
        Order newOrder = new Order(name);
        orders.add(newOrder);
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order nextOrder = orders.poll();
            LOGGER.info("Delivering the next order: {}", nextOrder);
        } else {
            LOGGER.info("No orders to deliver");
        }
    }

    public void deliver(int orderNumber) {
        Order orderToDeliver = null;

        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                orderToDeliver = order;
                break;
            }
        }

        if (orderToDeliver != null) {
            LOGGER.info("Delivering order with number {}: {}", orderNumber, orderToDeliver);
            orders.remove(orderToDeliver);
        } else {
            LOGGER.error("Order with number {} not found", orderNumber);
        }
    }

    public void draw() {
        LOGGER.info("Current state of the order queue:");
        LOGGER.info("===============================");
        LOGGER.info("Num | Name");

        for (Order order : orders) {
            LOGGER.info("{} | {}", order.getOrderNumber(), order.getName());
        }
    }
}