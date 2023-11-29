package example.lesson19;


public class Runner {


    public static void main(String[] args) throws InterruptedException {
        GateService gateService = new GateService();
        for (int i = 0; i < 200; i++) {
            gateService.open();
            Thread.sleep(10);
            gateService.close();
        }
    }
}