package homework.Homework.TABLE;
public class Homework {
    private int id;
    private String name;
    private String description;

    public Homework(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Homework() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printHomeworkInfo() {
        System.out.println("Homework ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
    }

    public boolean isEqualTo(Homework otherHomework) {
        return this.id == otherHomework.id
                && this.name.equals(otherHomework.name)
                && this.description.equals(otherHomework.description);
    }
}


