package homework.hom3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5),new Triangle(4,3),new Square(6)};
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        System.out.println("Total area of all shapes: " + totalArea);

        Participant[] participants = {new Person("Dobby"),new Cat("Richy"),new Robot("H2-D2")};
        Obstacle[] obstacles = {new RunningTrack(300),new Wall(1),new RunningTrack(500),new Wall(2)};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
            }
        }
    }
}
