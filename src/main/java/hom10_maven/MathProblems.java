package hom10_maven;
import org.example.MathOperations;


public class MathProblems {
    public static void main(String[] args) {
        // Tasks 1-8: Call methods from MathOperations to solve tasks 1-8
        int resultAdd = MathOperations.add(5,3);
        int resultSubtract = MathOperations.subtract(5,3);
        int resultMultiply = MathOperations.multiply(5,3);
        int resultDivide = MathOperations.divide(6,3);

        System.out.println("Addition result: " + resultAdd);
        System.out.println("Subtraction result: " + resultSubtract);
        System.out.println("Multiplication result: " + resultMultiply);
        System.out.println("Division result: " + resultDivide);

        // Tasks 9 and 10: Call methods from MathOperations to solve problems 9 and 10
        int resultTask9 = MathOperations.add(15,25);
        int resultTask10 = MathOperations.subtract(100,75);

        System.out.println("Task 9 result: " + resultTask9);
        System.out.println("Task 10 result: " + resultTask10);

        // Additional tasks: Call methods from MathOperations for additional tasks
        // Task 1: Additional task 1
        int resultTask1 = MathOperations.add(10,20);
        System.out.println("Task 1 result: " + resultTask1);

        // Task 2: Additional task 2
        int resultTask2 = MathOperations.subtract(30,15);
        System.out.println("Task 2 result: " + resultTask2);

        // Task 3: Additional task 3
        int resultTask3 = MathOperations.multiply(7,8);
        System.out.println("Task 3 result: " + resultTask3);

        // Task 4: Additional task 4
        int resultTask4 = MathOperations.divide(50,5);
        System.out.println("Task 4 result: " + resultTask4);

        // Task 5: Additional task 5
        int resultTask5 = MathOperations.add(42,58);
        System.out.println("Task 5 result: " + resultTask5);

        // Task 6: Additional task 6
        int resultTask6 = MathOperations.subtract(1000,753);
        System.out.println("Task 6 result: " + resultTask6);

        // Task 7: Additional task 7
        int resultTask7 = MathOperations.multiply(123,456);
        System.out.println("Task 7 result: " + resultTask7);

        // Task 8: Additional task 8
        int resultTask8 = MathOperations.divide(144,12);
        System.out.println("Task 8 result: " + resultTask8);
    }
}