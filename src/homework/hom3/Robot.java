package homework.hom3;

    class Robot implements Participant {
        String name;

        public Robot(String name) {
            this.name = name;
        }

        public void run() {
            System.out.println("Robot " + name + " is running");
        }

        public void jump() {
            System.out.println("Robot " + name + " is jumping");
        }
    }
