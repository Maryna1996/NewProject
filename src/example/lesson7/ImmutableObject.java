package example.lesson7;


public final class ImmutableObject {
    private int state;

    public ImmutableObject(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
