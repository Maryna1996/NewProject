package homework.hom20.Builder;

public class CarBuilderImpl {
    private Car car;

    public CarBuilderImpl() {
        car = new Car("", "", 0, "");
    }

    public CarBuilderImpl buildMake(String make) {
        car.setMake(make);
        return this;
    }

    public CarBuilderImpl buildModel(String model) {
        car.setModel(model);
        return this;
    }

    public CarBuilderImpl buildYear(int year) {
        car.setYear(year);
        return this;
    }

    public CarBuilderImpl buildColor(String color) {
        car.setColor(color);
        return this;
    }

    public CarBuilderImpl buildEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilderImpl buildSuspension(String suspension) {
        car.setSuspension(suspension);
        return this;
    }

    public CarBuilderImpl buildInterior(String interior) {
        car.setInterior(interior);
        return this;
    }

    public Car getResult() {
        return car;
    }
}