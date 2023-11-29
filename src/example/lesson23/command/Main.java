package example.lesson23.command;

public class Main {


    public static void main(String[] args) {

        Light light = new Light();


        Command switchDown = new FlipDownCommand(light);
        Command switchUp = new FlipUpCommand(light);

        Switch mySwitch = new Switch();

        mySwitch.executeAndStore("ON", switchUp);
        mySwitch.executeAndStore("OFF", switchDown);


        mySwitch.getHistory().get("ON").execute();
    }

    private static class FlipUpCommand implements Command {
        public FlipUpCommand(Light light) {
        }

        @Override
        public void execute() {

        }
    }
}
