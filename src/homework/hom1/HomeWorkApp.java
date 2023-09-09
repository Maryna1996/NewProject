package homework.hom1;

    public class HomeWorkApp {
        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();

            int a = 5;
            int b = 15;
            System.out.println(isSumInRange(a, b));

            int number = -7;
            printPositiveOrNegative(number);

            int number2 = 10;
            System.out.println(isNegative(number2));

            String text = "Hello, Java!";
            int repeatCount = 3;
            printTextMultipleTimes(text, repeatCount);

            int year = 2024;
            System.out.println(isLeapYear(year));
        }

        public static void printThreeWords() {
            System.out.println("Orange\nBanana\nApple");
        }

        public static void checkSumSign() {
            int a = 5;
            int b = -3;
            int sum = a + b;
            System.out.println(sum >= 0 ? "Sum is positive" : "Sum is negative");
        }

        public static void printColor() {
            int value = 101;
            if (value <= 0) {
                System.out.println("Red");
            } else if (value <= 100) {
                System.out.println("Yellow");
            } else {
                System.out.println("Green");
            }
        }

        public static void compareNumbers() {
            int a = 7;
            int b = 12;
            System.out.println(a >= b ? "a >= b" : "a < b");
        }

        public static boolean isSumInRange(int a, int b) {
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }

        public static void printPositiveOrNegative(int number) {
            System.out.println(number >= 0 ? "The number is positive" : "The number is negative");
        }

        public static boolean isNegative(int number) {
            return number < 0;
        }

        public static void printTextMultipleTimes(String text, int repeatCount) {
            for (int i = 0; i < repeatCount; i++) {
                System.out.println(text);
            }
        }

        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
}
