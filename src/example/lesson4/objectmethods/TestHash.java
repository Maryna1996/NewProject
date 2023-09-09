package example.lesson4.objectmethods;
import java.util.Objects;
public class TestHash {

    private int field1;
    private int field2;

    private Integer i;
    String s;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestHash testHash)) {
            return false;
        }
        return field1 == testHash.field1 && field2 == testHash.field2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1, field2);
    }

    @Override
    public String toString() {
        return "TestHash{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                '}';
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }


    public static void main(String[] args) {
        TestHash testHash = new TestHash();
        testHash.setField1(1);
        testHash.setField2(2);

        System.out.println(testHash.hashCode());



        TestHash testHash1 = new TestHash();
        testHash1.setField1(1);
        testHash1.setField2(2);

        System.out.println(testHash.equals(testHash1));

        System.out.println(testHash);

    }
}
