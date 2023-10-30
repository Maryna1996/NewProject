package homework.hom20.Builder;
public class Main {
        public static void main(String[] args) {
            CarBuilder builder = new CarBuilder();
            CarDirector director = new CarDirector(builder);

            Car car = director.buildCar();
            System.out.println("Car details: " + car);
        }
    }

