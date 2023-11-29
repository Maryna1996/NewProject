package example.lesson24;

public class Calculator {

    private MathOperationsService mathOperationsService;

    public Calculator(MathOperationsService mathOperationsService) {
        this.mathOperationsService = mathOperationsService;
    }

    public int sum(int a, int b) {
        return a + b;
    }


    public int div(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int externalOperation(int a, int b) {
        return mathOperationsService.operation(a, b) * 2;
    }
}
