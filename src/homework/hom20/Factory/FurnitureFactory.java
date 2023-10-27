package homework.hom20.Factory;
public class FurnitureFactory {
    public Furniture createFurniture(String type) {
        if ("chair".equalsIgnoreCase(type)) {
            return new Chair();
        } else if ("table".equalsIgnoreCase(type)) {
            return new Table();
        }
        return null;
    }
}
