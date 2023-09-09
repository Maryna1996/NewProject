package homework.hom3;

class Square implements Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}
