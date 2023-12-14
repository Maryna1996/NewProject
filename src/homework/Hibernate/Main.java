package homework.Hibernate;


import homework.Hibernate.DAO.CourseDao;
import homework.Hibernate.DAO.StudentDAO;
import homework.Hibernate.model.Course;
import homework.Hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateSession.Configuration()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            StudentDAO studentDAO = new StudentDAO(session);
            CourseDao courseDao = new CourseDao(session);

            long studentId = 1;
            Student student = studentDAO.findById(studentId);
            System.out.println("Found student: " + student);

            Course course = courseDao.findById(2);
            studentDAO.findById(2).addCourse(course);

            Student studentToAdd = studentDAO.findById(3);
            courseDao.findById(2).addStudent(studentToAdd);

            // [Student(id=3, name=Maryna, email=maryalex.m96@gmail.com)]
            System.out.println(courseDao.findById(2).getStudents());
            // [Course(courseId=4, name=Innovative entrepreneurship and startup project management), Course(courseId=3, name=Anti-crisis management of the enterprise)]
            System.out.println(studentDAO.findById(2).getCourses());
            // [Course(courseId=2, name=Anti-crisis management of the enterprise)]
            System.out.println(studentDAO.findById(3).getCourses());

            session.getTransaction().commit();
        }
    }
}
