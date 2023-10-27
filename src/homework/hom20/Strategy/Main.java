package homework.hom20.Strategy;

public class Main {
    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();

        // Calculation of flat rectangles
        calculator.setCalculationStrategy(new RectangleStrategy(5.0, 10.0));
        double rectangleArea = calculator.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);

        // Calculate the area of the triangle
        calculator.setCalculationStrategy(new TriangleStrategy(6.0, 8.0));
        double triangleArea = calculator.calculateArea();
        System.out.println("Triangle Area: " + triangleArea);
    }
}

