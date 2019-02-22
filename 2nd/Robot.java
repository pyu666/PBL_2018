public class Robot {
    private String name;
    public Robot(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void order(RobotCommand command) {
        command.print(this.name);
    }
    public enum RobotCommand {
        WALK {
            public void print(String name){
                System.out.println(name+" walk.");
            }
        },
        STOP {
            public void print(String name){
                System.out.println(name+" stop.");
            }

        }, JUMP {
            public void print(String name){
                System.out.println(name+" jump.");
            }
        };
        public abstract void print(String name);
    }
}
