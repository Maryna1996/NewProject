package homework.hom20.Strategy;
public class ShapeCalculator {
    private ShapeStrategy strategy;

    public void setCalculationStrategy(ShapeStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateArea() {
        if (strategy != null) {
            return strategy.calculateArea();
        } else {
            return 0.0;
        }
    }
}

