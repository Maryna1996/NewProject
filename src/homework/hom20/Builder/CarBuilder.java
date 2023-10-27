package homework.hom20.Builder;

public interface CarBuilder {
    void buildMake(String make);
    void buildModel(String model);
    void buildYear(int year);
    void buildColor(String color);
    void buildEngine(String engine);
    void buildSuspension(String suspension);
    void buildInterior(String interior);
    Car getResult();
}
