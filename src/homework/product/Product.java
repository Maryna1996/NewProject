package homework.product;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String type;
    private double price;
    private boolean discount;
    private LocalDate addDate;

    public Product(int id, String type, double price, boolean discount, LocalDate addDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.addDate = addDate;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public static List<Product> filterExpensiveBooks(List<Product> products) {
        return products.stream()
                .filter(product -> "Book".equals(product.getType()) && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public static List<Product> filterDiscountedBooks(List<Product> products) {
        return products.stream()
                .filter(product -> "Book".equals(product.getType()) && product.isDiscount())
                .map(product -> new Product(product.getId(), product.getType(), product.getPrice() * 0.9, product.isDiscount(), product.getAddDate()))
                .collect(Collectors.toList());
    }

    private int getId() {
        return 0;
    }

    public static Product findCheapestBook(List<Product> products) {
        return products.stream()
                .filter(product -> "Book".equals(product.getType()))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("Продукт [категорія: Book] не знайдено"));
    }

    public static List<Product> findLatestProducts(List<Product> products, int count) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getAddDate).reversed())
                .limit(count)
                .collect(Collectors.toList());
    }

    public static double calculateTotalCost(List<Product> products) {
        int currentYear = LocalDate.now().getYear();
        return products.stream()
                .filter(product -> product.getAddDate().getYear() == currentYear)
                .filter(product -> "Book".equals(product.getType()))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static Map<String, List<Product>> groupByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", addDate=" + addDate +
                '}';
    }
}
