package homework.hom7;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mary Grom","Manager","maryalex.m96@gmail.com","+380991529455",27);

        System.out.println("Employee details:");
        System.out.println("Full Name: " + employee.getFullName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone Number: " + employee.getPhone());
        System.out.println("Age: " + employee.getAge());

        SameName sameName = new SameName();

        Car car = new Car();
        car.start();
    }
}
