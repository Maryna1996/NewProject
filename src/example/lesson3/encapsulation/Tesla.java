package example.lesson3.encapsulation;
import java.util.Objects;
import java.util.Random;

    public class Tesla extends Car {

        private int speed;

        public Tesla() {
            autoPilot();
        }

        @Override
        public int getSpeed() {
            System.out.println("Tesla");
            return speed;
        }

        private void autoPilot() {
            Random r = new Random();
            int minSpeed = 50;
            int maxSpeed = 300;
            speed = r.nextInt(maxSpeed - minSpeed) + minSpeed;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Tesla tesla)) {
                return false;
            }
            return getSpeed() == tesla.getSpeed();
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), getSpeed());
        }
    }
