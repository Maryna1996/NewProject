package homework.hom20.Builder;


public class CarBuilder {
    private Car car;

    public CarBuilder() {
        car = new Car("", "", 0, "");
    }

    public CarBuilder buildMake(String make) {
        car.setMake(make);
        return this;
    }

    public CarBuilder buildModel(String model) {
        car.setModel(model);
        return this;
    }

    public CarBuilder buildYear(int year) {
        car.setYear(year);
        return this;
    }

    public CarBuilder buildColor(String color) {
        car.setColor(color);
        return this;
    }

    public CarBuilder buildEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilder buildSuspension(String suspension) {
        car.setSuspension(suspension);
        return this;
    }

    public CarBuilder buildInterior(String interior) {
        car.setInterior(interior);
        return this;
    }

    public Car getResult() {
        return car;
    }
}