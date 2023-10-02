package homework.product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Book", 350.0, false, LocalDate.of(2022, 1, 15)));
        products.add(new Product(2, "Toy", 50.0, true, LocalDate.of(2022, 2, 20)));
        products.add(new Product(3, "Book", 200.0, true, LocalDate.of(2022, 3, 25)));
        products.add(new Product(4, "Book", 100.0, false, LocalDate.of(2022, 4, 10)));
        products.add(new Product(5, "Book", 70.0, true, LocalDate.of(2022, 5, 5)));
        products.add(new Product(6, "Toy", 30.0, true, LocalDate.of(2022, 6, 15)));

        // Task 1.1: Get expensive books (price > 250)
        List<Product> expensiveBooks = Product.filterExpensiveBooks(products);
        System.out.println("Expensive Books: " + expensiveBooks);

        // Task 2.2: Get discounted books (10% discount)
        List<Product> discountedBooks = Product.filterDiscountedBooks(products);
        System.out.println("Discounted Books: " + discountedBooks);

        // Task 3.1: Find the cheapest book
        Product cheapestBook = Product.findCheapestBook(products);
        System.out.println("Cheapest Book: " + cheapestBook);

        // Task 3.3: Get the three latest products
        List<Product> latestProducts = Product.findLatestProducts(products, 3);
        System.out.println("Latest Products: " + latestProducts);

        // Task 5.2: Calculate total cost of books added in the current year (price <= 75)
        double totalCost = Product.calculateTotalCost(products);
        System.out.println("Total Cost: " + totalCost);

        // Task 6.2: Group products by type
        Map<String, List<Product>> groupedProducts = Product.groupByType(products);
        System.out.println("Grouped Products: " + groupedProducts);
    }
}