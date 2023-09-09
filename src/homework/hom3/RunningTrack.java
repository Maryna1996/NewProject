package homework.hom3;


class RunningTrack implements Obstacle {
    private static final int MIN_LENGTH_CAT = 200;
    private static final int MIN_LENGTH_ROBOT = 1000;

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public void overcome(Participant participant) {
        participant.run();
        if (participant instanceof Cat && length > MIN_LENGTH_CAT) {
            System.out.println("Cat " + ((Cat) participant).name + " did not overcome the running track");
        } else if (participant instanceof Robot && length > MIN_LENGTH_ROBOT) {
            System.out.println("Robot " + ((Robot) participant).name + " did not overcome the running track");
        } else {
            System.out.println("Participant " + participant + " overcame the running track");
        }
    }
}
