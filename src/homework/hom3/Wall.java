package homework.hom3;

class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(Participant participant) {
        participant.jump();
        if (participant instanceof Robot && height > 2) {
            System.out.println("Robot " + ((Robot) participant).name + " did not overcome the wall");
        } else if (participant instanceof Person && height > 1) {
            System.out.println("Person " + ((Person) participant).name + " did not overcome the wall");
        } else if (participant instanceof Cat && height > 1) {
            System.out.println("Cat " + ((Cat) participant).name + " did not overcome the wall");
        } else {
            System.out.println("Participant " + participant + " overcame the wall");
        }
    }
}
