import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle t1 = new Turtle(turtleWorld);
        t1.setBodyColor(Color.RED);
        t1.setShellColor(Color.RED);
        t1.setPenColor(Color.RED);
        t1.penDown();
        t1.setPenWidth(5);
        t1.turnLeft();
        t1.forward(300);
        t1.turnLeft();
        t1.forward(300);
        t1.turnLeft();
        t1.forward(300);
        t1.turn(-142);
        t1.forward(380);
        t1.turn(232);
        t1.forward(300);
        t1.turn(-128);
        t1.forward(385);
        
        Turtle t2 = new Turtle(turtleWorld);
        t2.setBodyColor(Color.BLUE);
        t2.setShellColor(Color.BLUE);
        t2.setPenColor(Color.BLUE);
        t2.penDown();
        t2.setPenWidth(5);
        t2.turnRight();
        t2.forward(300);
        t2.turn(-140);
        t2.forward(385);
        Turtle t3 = new Turtle(turtleWorld);
        t3.setBodyColor(Color.YELLOW);
        t3.setShellColor(Color.YELLOW);
        t3.setPenColor(Color.YELLOW);
        t3.penDown();
        t3.setPenWidth(5);
        t3.forward(300);
        t3.turn(-128);
        t3.forward(385);
        Turtle shah = new Turtle(turtleWorld);
        shah.setBodyColor(Color.GREEN);
        shah.setShellColor(Color.GREEN);
        shah.setPenColor(Color.GREEN);
        shah.penDown();
        shah.setPenWidth(5);
        shah.backward(300);
        shah.turn(52);
        shah.forward(385);
        shah.turn(128);
        shah.forward(300);
        shah.turn(90);
        shah.forward(298);
        shah.backward(298);
        shah.turn(-90);
        shah.turn(128);
        shah.forward(385);

    }
}