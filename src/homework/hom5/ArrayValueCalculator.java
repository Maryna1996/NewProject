package homework.hom5;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int totalSum = 0;

        // Check array size
        if (array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException("Array must be of size 4x4");
        }

        // Calculation of the sum of the values in the array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Convert the string value to an integer and add it to the sum
                try {
                    totalSum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // If conversion fails, log the error and continue with the next value
                    String message = "Invalid data in cell (" + i + ", " + j + "): " + array[i][j];
                    ArrayDataException dataException = new ArrayDataException(message, e);
                    System.err.println(message);
                    throw dataException;
                }
            }
        }

        return totalSum;
    }

    public static class ArraySizeException extends Exception {
        public ArraySizeException(String message) {
            super(message);
        }
    }
    public static class ArrayDataException extends Exception {
        public ArrayDataException(String message, Throwable cause) {
            super(message, cause);
        }
    }
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "abc"}
        };
        try {
            int result = doCalc(validArray);
            System.out.println("Total sum: " + result);
        } catch (ArraySizeException e) {
            System.out.println("ArraySizeException: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("ArrayDataException: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            int result = doCalc(invalidArray);
            System.out.println("Total sum: " + result);
        } catch (ArraySizeException e) {
            System.out.println("ArraySizeException: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("ArrayDataException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}