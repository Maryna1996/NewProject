package example.lesson6.stckoverflow;


public class Main {


    public int calculateFactorial(int number) {
        return number * calculateFactorial(number - 1);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.calculateFactorial(1);
    }
}
