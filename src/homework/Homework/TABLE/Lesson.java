package homework.Homework.TABLE;
import java.time.LocalDateTime;
public class Lesson {
    private Homework homework;
    private int id;
    private String name;
    private LocalDateTime updatedAt;

    public Lesson(int id, String name, LocalDateTime updatedAt, Homework homework) {
        this.id = id;
        this.name = name;
        this.updatedAt = updatedAt;
        this.homework = homework;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Homework getHomework() {
        return homework;
    }

    public void setHomework(Homework homework) {
        this.homework = homework;


    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

}


