package homework.hom13;

import java.time.LocalDate;

class Product {
    private int id;
    private String type;
    private double price;
    private boolean discount;
    private LocalDate addDate;
    private String category;

    // Constructors, getters and setters

    // Examples of constructors and getters/setters:
    public Product(int id, String type, double price, boolean discount, LocalDate addDate, String category) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.addDate = addDate;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public String getCategory() {
        return category;
    }

// Other methods and toString() for debugging

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", addDate=" + addDate +
                ", category='" + category + '\'' +
                '}';
    }
}
