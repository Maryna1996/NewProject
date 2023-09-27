
package homework.hom13;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();

        // Add products to the list
        products.add(new Product(1, "Book", 350.0, false, LocalDate.of(2022, 1, 15), "Book"));
        products.add(new Product(2, "Toy", 50.0, true, LocalDate.of(2022, 2, 20), "Toy"));
        products.add(new Product(3, "Book", 200.0, true, LocalDate.of(2022, 3, 25), "Book"));
        products.add(new Product(4, "Book", 100.0, false, LocalDate.of(2022, 4, 10), "Book"));
        products.add(new Product(5, "Book", 70.0, true, LocalDate.of(2022, 5, 5), "Book"));
        products.add(new Product(6, "Toy", 30.0, true, LocalDate.of(2022, 6, 15), "Toy"));

        // Here you can perform tasks using the Stream API

        // Examples of tasks:
        // 1. Getting a list of products in the "Book" category with a price greater than 250:
        List<Product> expensiveBooks = products.stream()
                .filter(product -> product.getCategory().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());

        // 2. Getting the three most recently added products:
        List<Product> latestProducts = products.stream()
                .sorted(Comparator.comparing(Product::getAddDate).reversed())
                .limit(3)
                .collect(Collectors.toList());

        // 3. Grouping products by type:
        Map<String, List<Product>> groupedProducts = products.stream()
                .collect(Collectors.groupingBy(Product::getType));

        // Output results
        System.out.println("Expensive Books: " + expensiveBooks);
        System.out.println("Latest Products: " + latestProducts);
        System.out.println("Grouped Products: " + groupedProducts);
    }
}



