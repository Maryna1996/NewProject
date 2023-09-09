package example.lesson5.polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        DeoMatiz deoMatiz = new DeoMatiz();
        Toyota toyota = new Toyota();

        List<Car> cars = new ArrayList<>();
        cars.add(tesla);
        cars.add(deoMatiz);
        cars.add(toyota);




        Policeman policeman = new Policeman();
        policeman.setCar(cars);
        policeman.checkSpeed();

    }
}
