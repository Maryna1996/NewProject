package homework.Calculator;

public class ValueCalculator {
    private final float[] array;
    private final int size;
    private final int halfSize;

    public ValueCalculator(int size) {
        if (size < 1000000) {
            throw new IllegalArgumentException("Array size must be at least 1,000,000");
        }
        this.size = size;
        this.halfSize = size / 2;
        this.array = new float[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1.0f;
        }
    }

    public void calculate() {
        long start = System.currentTimeMillis();

        float[] a1 = new float[halfSize];
        float[] a2 = new float[halfSize];

        System.arraycopy(array, 0, a1, 0, halfSize);
        System.arraycopy(array, halfSize, a2, 0, halfSize);

        Thread thread1 = new Thread(() -> calculatePart(a1, 0));
        Thread thread2 = new Thread(() -> calculatePart(a2, halfSize));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, array, 0, halfSize);
        System.arraycopy(a2, 0, array, halfSize, halfSize);

        long end = System.currentTimeMillis();
        long executionTime = end - start;
        System.out.println("Execution time: " + executionTime + " ms");
    }

    private void calculatePart(float[] part, int offset) {
        for (int i = 0; i < part.length; i++) {
            int index = i + offset;
            part[i] = (float) (part[i] * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
        }
    }

    public float[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    public int getHalfSize() {
        return halfSize;
    }

}
