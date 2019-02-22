public class R7_3 {
    public static void main(String[] args) {
        Robot r = new Robot("kuro");
        r.order(Robot.RobotCommand.WALK);
        r.order(Robot.RobotCommand.STOP);
        r.order(Robot.RobotCommand.JUMP);
    }
}
