package homework.hom20.Factory;

public class Main {
        public static void main(String[] args) {

            FurnitureFactory modernFactory = new ModernFurnitureFactory();
            Chair modernChair = modernFactory.createChair();
            Sofa modernSofa = modernFactory.createSofa();
            Table modernTable = modernFactory.createTable();


            FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
            Chair victorianChair = victorianFactory.createChair();
            Sofa victorianSofa = victorianFactory.createSofa();
            Table victorianTable = victorianFactory.createTable();


            modernChair.sitOn();
            modernSofa.relaxOn();
            modernTable.putOn();

            victorianChair.sitOn();
            victorianSofa.relaxOn();
            victorianTable.putOn();
        }
    }