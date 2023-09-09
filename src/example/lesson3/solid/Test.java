package example.lesson3.solid;
import java.util.Objects;
    public class Test {
        private int age;

        public Test(int age) {
            this.age = age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Test test)) {
                return false;
            }
            return age == test.age;
        }

        @Override
        public int hashCode() {
            return Objects.hash(age);
        }

        public static void main(String[] args) {
            Test test = new Test(1);
            System.out.println(test.hashCode());
            test.setAge(2);
            System.out.println(test.hashCode());
        }
    }
