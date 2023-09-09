package homework.hom6;

import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void addFruits(ArrayList<T> newFruits) {
        fruits.addAll(newFruits);
    }

    public float getWeight() {
        float totalWeight = 0;
        for (Fruit fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void merge(Box<? extends T> anotherBox) {
        if (this == anotherBox) {
            return; // Cannot transfer to itself
        }

        if (fruits.isEmpty()) {
            fruits.addAll(anotherBox.fruits);
            anotherBox.fruits.clear();
        } else {
            throw new IllegalArgumentException("Cannot merge boxes with fruits of different types.");
        }
    }
}