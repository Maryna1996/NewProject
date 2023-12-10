package homework.Loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Order implements Comparable<Order> {
    private static final Logger LOGGER = LoggerFactory.getLogger(Order.class);

    private static int nextOrderNumber = 1;

    private final int orderNumber;
    private final String name;

    public Order(String name) {
        this.orderNumber = nextOrderNumber++;
        this.name = name;
        LOGGER.info("Creating Order instance with number {} and name {}", orderNumber, name);
    }

    public int getOrderNumber() {
        LOGGER.info("Getting order number: {}", orderNumber);
        return orderNumber;
    }

    public String getName() {
        LOGGER.info("Getting order name: {}", name);
        return name;
    }

    @Override
    public int compareTo(Order other) {
        return Integer.compare(this.orderNumber, other.orderNumber);
    }

    @Override
    public String toString() {
        return String.format("%d | %s", orderNumber, name);
    }
}
