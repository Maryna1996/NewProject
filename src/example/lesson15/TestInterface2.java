package example.lesson15;

public interface TestInterface2 {

    int calculate(int a1, int a2);

    default String getConstant() {
        return "ConstantString11111";
    }
}
