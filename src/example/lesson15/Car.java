package example.lesson15;
import java.util.List;

public class Car {

    private int id;
    private List<Passangers> passangersList;

    public Car(int id, List<Passangers> passangersList) {
        this.id = id;
        this.passangersList = passangersList;
    }

    public int getId() {
        return id;
    }

    public List<Passangers> getPassangersList() {
        return passangersList;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", passangersList=" + passangersList +
                '}';
    }
}