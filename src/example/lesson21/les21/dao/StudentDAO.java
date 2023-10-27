package example.lesson21.les21.dao;

import example.lesson21.les21.dto.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    public class StudentDAO {

        private Connection connection;

        public StudentDAO(Connection connection) {
            this.connection = connection;
        }

        public int addStudent(Student student) throws SQLException {
            try (PreparedStatement preparedStatement = connection.prepareStatement
                    ("INSERT INTO students (name, phone_number, description) VALUES (?, ?, ?);")) {
                preparedStatement.setString(1, student.getName());
                preparedStatement.setString(2, student.getPhone());
                preparedStatement.setString(3, student.getDescription());
                return preparedStatement.executeUpdate();
            }
        }

        public List<Student> getStudents() throws SQLException {
            List<Student> students = new ArrayList<>();

            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {
                    while (resultSet.next()) {
                        students.add(new Student(resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getString("phone_number"),
                                resultSet.getString("description")));
                    }
                }
            }
            return students;
        }
    }

