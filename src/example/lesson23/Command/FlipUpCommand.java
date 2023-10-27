package example.lesson23.Command;

public class FlipUpCommand implements Command {
    private Light light;

    public FlipUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
