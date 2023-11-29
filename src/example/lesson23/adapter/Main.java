package example.lesson23.adapter;
public class Main {

    public static void main(String[] args) {

        Train train = new Train() {
            @Override
            public void movingOnRails() {

            }
        };
        Car car = new Car();

        CarAdapter carAdapter = new CarAdapter(car);

        Railway railway = new Railway();
        railway.add(train);
        railway.add(carAdapter);
    }
}