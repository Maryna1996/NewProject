package example.lesson23.Command;

public class Main {


    public static void main(String[] args) {

        Light light = new Light();

        Command switchDown = new FlipDownCommand(light);

        Switch mySwitch = new Switch();

        mySwitch.executeAndStore("OFF", switchDown);


        mySwitch.getHistory().get("ON").execute();
    }
}