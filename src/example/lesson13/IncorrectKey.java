package example.lesson13;

public class IncorrectKey {
    private int i;

    public IncorrectKey(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}