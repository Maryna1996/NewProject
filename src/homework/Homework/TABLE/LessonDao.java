package homework.Homework.TABLE;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LessonDao {
    private Connection connection;

    public LessonDao(Connection connection) {
        this.connection = connection;
    }

    public void addLesson(Lesson lesson) {
        try {
            String sql = "INSERT INTO Lesson(name, updatedAt, homework_id) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, lesson.getName());
                LocalDateTime updatedAt = lesson.getUpdatedAt() != null ? lesson.getUpdatedAt() : LocalDateTime.now();
                statement.setTimestamp(2, Timestamp.valueOf(updatedAt));
                statement.setInt(3, lesson.getHomework().getId());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteLesson(int lessonId) {
        String sql = "DELETE FROM Lesson WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, lessonId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Lesson> getAllLessons() {
        List<Lesson> lessons = new ArrayList<>();
        String sql = "SELECT Lesson.id, Lesson.name, Lesson.updatedAt, Homework.id, Homework.name, Homework.description " +
                "FROM Lesson " +
                "LEFT JOIN Homework ON Lesson.homework_id = Homework.id";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int lessonId = resultSet.getInt("Lesson.id");
                String lessonName = resultSet.getString("Lesson.name");
                Timestamp updatedAt = resultSet.getTimestamp("Lesson.updatedAt");

                int homeworkId = resultSet.getInt("Homework.id");
                String homeworkName = resultSet.getString("Homework.name");
                String homeworkDescription = resultSet.getString("Homework.description");

                Homework homework = new Homework(homeworkId, homeworkName, homeworkDescription);
                Lesson lesson = new Lesson(lessonId, lessonName, updatedAt.toLocalDateTime(), homework);
                lessons.add(lesson);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lessons;
    }

    public Lesson getLessonById(int lessonId) {
        String sql = "SELECT Lesson.id, Lesson.name, Lesson.updatedAt, Homework.id, Homework.name, Homework.description " +
                "FROM Lesson " +
                "LEFT JOIN Homework ON Lesson.homework_id = Homework.id " +
                "WHERE Lesson.id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, lessonId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("Lesson.id");
                String name = resultSet.getString("Lesson.name");
                Timestamp updatedAt = resultSet.getTimestamp("Lesson.updatedAt");

                int homeworkId = resultSet.getInt("Homework.id");
                String homeworkName = resultSet.getString("Homework.name");
                String homeworkDescription = resultSet.getString("Homework.description");

                Homework homework = new Homework(homeworkId, homeworkName, homeworkDescription);
                return new Lesson(id, name, updatedAt.toLocalDateTime(), homework);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
