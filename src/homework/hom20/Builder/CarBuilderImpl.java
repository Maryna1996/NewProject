package homework.hom20.Builder;

public class CarBuilderImpl implements CarBuilder {
    private Car car;

    public CarBuilderImpl() {
        car = new Car("", "", 0, "");
    }

    @Override
    public void buildMake(String make) {
        car.setMake(make);
    }

    @Override
    public void buildModel(String model) {
        car.setModel(model);
    }

    @Override
    public void buildYear(int year) {
        car.setYear(year);
    }

    @Override
    public void buildColor(String color) {
        car.setColor(color);
    }

    @Override
    public void buildEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void buildSuspension(String suspension) {
        car.setSuspension(suspension);
    }

    @Override
    public void buildInterior(String interior) {
        car.setInterior(interior);
    }

    @Override
    public Car getResult() {
        return car;
    }
}
