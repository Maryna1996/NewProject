package homework.Calculator;

public class Main {
    public static void main(String[] args) {
        int arraySize = 1000000; // Array size
        ValueCalculator calculator = new ValueCalculator(arraySize);

        // Perform calculations and measure time
        calculator.calculate();

        // We get the results of calculations
        float[] resultArray = calculator.getArray();
        int size = calculator.getSize();
        int halfSize = calculator.getHalfSize();

        // Output the first and last 10 elements of the array for verification
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ": " + resultArray[i]);
            System.out.println("Element " + (size - 10 + i) + ": " + resultArray[size - 10 + i]);
        }
    }
}
