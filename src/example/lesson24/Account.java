package example.lesson24;

public class Account {

    private int id;
    private String firstName;
    private String secondName;

    public Account(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    static final class Builder {
        private int id;
        private String firstName;
        private String secondName;


        private Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Account build() {
            return new Account(this);
        }

    }

}
