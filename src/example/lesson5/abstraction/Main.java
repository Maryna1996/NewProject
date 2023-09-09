package example.lesson5.abstraction;

public class Main {
    public static void main(String[] args) {
        Car tesla = new Tesla();
        Deo deo = new Deo();

        System.out.println(tesla.getClass());




        Car teslaModelX = new Car() {
            @Override
            int getSpeed() {
                return 130;
            }
        };


        System.out.println(teslaModelX.getClass());

        Car deoMatiz = new Car() {
            @Override
            int getSpeed() {
                return 60;
            }
        };
    }
}
