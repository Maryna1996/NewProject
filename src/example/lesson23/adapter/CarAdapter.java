package example.lesson23.adapter;

public class CarAdapter extends Train{

    private Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void movingOnRails() {
        car.movingOnRoad();
    }
}