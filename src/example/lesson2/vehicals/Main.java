package example.lesson2.vehicals;


import example.lesson2.persons.Policemen;

public class Main {

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        Policemen policemen = new Policemen();
        policemen.setTesla(tesla);
        policemen.checkSpeed();
    }
}