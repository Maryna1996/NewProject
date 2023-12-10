package example.lesson23.Command;

import java.util.HashMap;
import java.util.Map;

public class Switch {
    private Map<String, Command> history = new HashMap<>();


    public void executeAndStore(String code, Command command) {
        history.put(code, command);
        command.execute();
    }

    public Map<String, Command> getHistory() {
        return history;
    }
}