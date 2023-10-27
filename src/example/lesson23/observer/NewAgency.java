package example.lesson23.observer;

import java.util.ArrayList;
import java.util.List;

public class NewAgency {

    String event;

    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        channels.remove(channel);
    }

    public void setEvent(String event) {
        for (Channel channel : channels) {
            channel.update(event);
        }
    }

}
