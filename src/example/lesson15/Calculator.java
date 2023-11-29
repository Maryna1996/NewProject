package example.lesson15;

public class Calculator {

    int result(TestInterface testInterface, int a1, int a2) {
        return testInterface.calculate(a1, a2);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.result((a,b) -> Integer.sum(a,b), 2, 4));
        System.out.println(calculator.result((a1, a2) -> a1 - a2, 1232, 4));
        System.out.println(calculator.result((a1, a2) -> a1 * a2, 1232, 4));
        System.out.println(calculator.result((a1, a2) -> a1 / a2, 1232, 4));
    }
}