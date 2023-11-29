package homework.hom20.Strategy;

public class RectangleStrategy implements ShapeStrategy {
    private double width;
    private double height;

    public RectangleStrategy(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
