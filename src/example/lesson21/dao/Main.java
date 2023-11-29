package example.lesson21.dao;


import example.lesson21.dto.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/schema_name";
        String username = "dev";
        String password = "dev";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            StudentDAO studentDAO = new StudentDAO(connection);


            studentDAO.addStudent(new Student("TEst", "test", "test"));

            System.out.println(studentDAO.getStudents());

        }
    }
}