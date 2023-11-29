package homework.Homework.TABLE;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) throws SQLException {
        DataBaseConnection dbConnection = new DataBaseConnection();

        Homework homework1 = new Homework(1, "Homework 1", "Description of Homework 1");
        Homework homework2 = new Homework(2, "Homework 2", "Description of Homework 2");
        Homework homework3 = new Homework(3, "Homework 3", "Description of Homework 3");
        Homework homework4 = new Homework(4, "Homework 4", "Description of Homework 4");
        Homework homework5 = new Homework(5, "Homework 5", "Description of Homework 5");


        Lesson lesson1 = new Lesson(1, "Lesson 1", LocalDateTime.now(), homework1);
        Lesson lesson2 = new Lesson(2, "Lesson 2", LocalDateTime.now(), homework2);
        Lesson lesson3 = new Lesson(3, "Lesson 3", LocalDateTime.now(), homework3);
        Lesson lesson4 = new Lesson(4, "Lesson 4", LocalDateTime.now(), homework4);
        Lesson lesson5 = new Lesson(5, "Lesson 5", LocalDateTime.now(), homework5);


        Connection connection = DataBaseConnection.getConnection();
        LessonDao lessonDao = new LessonDao(connection);

        lessonDao.addLesson(lesson1);
        lessonDao.addLesson(lesson2);
        lessonDao.addLesson(lesson3);
        lessonDao.addLesson(lesson4);
        lessonDao.addLesson(lesson5);

        System.out.println("Lessons added to the database:");

        List<Lesson> lessons = lessonDao.getAllLessons();
        for (Lesson lesson : lessons) {
            System.out.println("Lesson ID: " + lesson.getId());
            System.out.println("Lesson Name: " + lesson.getName());
            System.out.println("Lesson Updated At: " + lesson.getUpdatedAt());
            System.out.println("Homework ID: " + lesson.getHomework().getId());
            System.out.println("Homework Name: " + lesson.getHomework().getName());
            System.out.println("Homework Description: " + lesson.getHomework().getDescription());
            System.out.println();
        }

        DataBaseConnection.close(connection);
    }
}