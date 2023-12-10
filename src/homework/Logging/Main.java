package homework.Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger MAIN_LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MAIN_LOGGER.info("Starting the Coffee Order Application");

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add("Alen");
        coffeeOrderBoard.add("Yoda");
        coffeeOrderBoard.add("Obi-van");
        coffeeOrderBoard.add("John Snow");

        coffeeOrderBoard.draw();

        MAIN_LOGGER.info("Delivering the next order");
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();

        int orderNumberToDeliver = 3;
        MAIN_LOGGER.info("Delivering order with number: {}", orderNumberToDeliver);
        coffeeOrderBoard.deliver(orderNumberToDeliver);
        coffeeOrderBoard.draw();

        MAIN_LOGGER.info("Coffee Order Application completed");
    }
}
