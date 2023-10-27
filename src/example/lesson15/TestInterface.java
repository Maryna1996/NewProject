package example.lesson15;

@FunctionalInterface
public interface TestInterface {
    int calculate(int a1,int a2);

    default String getConstant(){
        return "ConstantString";
    }
}
