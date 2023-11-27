org.example.SpringWeb.repository

import org.springframework.stereotype.Repository;
import spring.SpringWeb.model.Order;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class OrderRepository {

    private final CopyOnWriteArrayList<Order> orders;

    public OrderRepository() {
        this.orders = new CopyOnWriteArrayList<>();

        addOrder(new Order(1, "2023-01-01", 50.0, new CopyOnWriteArrayList<>()));
        addOrder(new Order(2, "2023-02-01", 75.0, new CopyOnWriteArrayList<>()));
    }

    public Optional<Order> getOrderById(long id) {
        return orders.stream()
                .filter(order -> order.getId() == id)
                .findFirst();
    }

    public List<Order> getAllOrders() {
        return new CopyOnWriteArrayList<>(orders);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrderById(long id) {
        orders.removeIf(order -> order.getId() == id);
    }
}