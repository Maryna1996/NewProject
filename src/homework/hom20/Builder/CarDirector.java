package homework.hom20.Builder;

public class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildCar() {
        builder.buildMake("Tesla");
        builder.buildModel("Model Y");
        builder.buildYear(2023);
        builder.buildColor("White");
        builder.buildEngine("Electric");
        builder.buildSuspension("Standard");
        builder.buildInterior("Premium Leather");
        return builder.getResult();
    }
}


