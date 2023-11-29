package example.lesson23.observer;

public class Main {


    public static void main(String[] args) {
        NewAgency observable = new NewAgency();



        EmailChannel emailObserver = new EmailChannel();

        MobilePushChannel pushObserver = new MobilePushChannel();


        observable.addObserver(emailObserver);

        observable.addObserver(pushObserver);


        observable.setEvent("new event");

        observable.setEvent("sdfsdfsdfsd");

        observable.removeObserver(pushObserver);

        observable.setEvent("45654654");
    }
}
