package homework.hom3;

class Cat implements Participant {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Cat " + name + " is running");
    }

    public void jump() {
        System.out.println("Cat " + name + " is jumping");
    }
}
