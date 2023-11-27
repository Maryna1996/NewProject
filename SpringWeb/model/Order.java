org.example.SpringWeb.model;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Order {
    private long id;
    private LocalDate date;
    private double cost;
    private List<Product> products;

    public Order() {
    }

    public Order(long id, LocalDate date, double cost, List<Product> products) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.products = products;
    }

    public Order(int id, String dateString, double cost, CopyOnWriteArrayList<Product> products) {
        this.id = id;
        this.cost = cost;
        this.products = products;

        // Convert the dateString to LocalDate
        this.date = LocalDate.parse(dateString);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}