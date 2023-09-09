package homework.hom3;

class Person implements Participant {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Person " + name + " is running");
    }

    public void jump() {
        System.out.println("Person " + name + " is jumping");
    }
}
