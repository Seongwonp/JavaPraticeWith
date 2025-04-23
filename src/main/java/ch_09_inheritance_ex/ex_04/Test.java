package ch_09_inheritance_ex.ex_04;

class Robot{}

class DanceRobot extends Robot{
    void dance(){
        System.out.println("Dance!!!!!");
    }
}

class SingRobot extends Robot{
    void sing(){
        System.out.println("Sing!!!!!");
    }
}

class DrawRobot extends Robot{
    void draw(){
        System.out.println("Draw!!!!!");
    }
}


public class Test {

    public static void action(Robot robot){
        if(robot instanceof DanceRobot){
            ((DanceRobot) robot).dance();
        }
        if(robot instanceof SingRobot){
            ((SingRobot) robot).sing();
        }
        if(robot instanceof DrawRobot){
            ((DrawRobot) robot).draw();
        }
    }

    public static void main(String[] args) {
        Robot[] robots = {new DanceRobot(), new SingRobot(), new DrawRobot()};
        for(Robot robot : robots){
            action(robot);
        }
    }
}
