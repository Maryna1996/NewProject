package example.lesson3.encapsulation;

public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        DeoMatiz deoMatiz = new DeoMatiz();




        Policeman policeman = new Policeman();
        policeman.setCar(tesla);
        policeman.checkSpeed();


        policeman.setCar(deoMatiz);
        policeman.checkSpeed();
    }
}
