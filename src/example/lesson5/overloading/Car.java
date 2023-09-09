package example.lesson5.overloading;

    public interface Car {

        void startEngine();

        void startEngine(int initTime);

        void startEngine(int initTime, String notificationMessage);
}
