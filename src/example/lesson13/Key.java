package example.lesson13;

import java.util.Objects;

public final class Key {

    private int i;

    public Key(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Key key)) {
            return false;
        }
        return i == key.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    @Override
    public String toString() {
        return "Key{" +
                "i=" + i +
                '}';
    }
}