import java.lang.Object;
import java.awt.Color;
import java.util.Random;

public class TurtleLab
{
    public static void main(String[] args)
    
    {
        Picture sponge = new Picture("sponge.png");

        World turtleworld = new World();
        turtleworld.setPicture(sponge);
        Turtle glen = new Turtle(90, 90, turtleworld);
        //glen.setPicture(sponge);
        
        Turtle craig = new Turtle(turtleworld);
        Turtle bob = new Turtle(400, 400,turtleworld);
        Turtle bill = new Turtle(100, 300, turtleworld);
        glen.setBodyColor(Color.blue);
        glen.setPenColor(Color.black);
        glen.setPenWidth(3);
        glen.forward(50);
        glen.turn(135);
        glen.forward(25);
        glen.turn(-90);
        glen.forward(25);
        glen.turn(135);
        glen.forward(50);
        glen.penUp();
        glen.turn(-90);
        glen.forward(10);
        glen.turn(-65);
        glen.penDown();
        glen.forward(50);
        glen.turn(130);
        glen.forward(25);
        glen.turn(115);
        glen.forward(20);
        glen.turn(180);
        glen.forward(20);
        glen.turn(65);
        glen.forward(25);
        glen.turn(-65);
        glen.penUp();
        glen.forward(10);
        glen.penDown();
        glen.turn(-65);
        glen.forward(45);
        glen.turn(-25);
        glen.penUp();
        glen.turn(-90);
        glen.forward(22);
        glen.turn(-122);
        glen.penDown();
        glen.forward(50);
        glen.hide();
        craig.penDown();
        Random rand = new Random();
        craig.setPenWidth(10);
        for(int i=1; i<900; i++)
        {
            craig.forward(12);
           
            int r = rand.nextInt(4);
            int g = rand.nextInt(255);
            int b = rand.nextInt(255);
            Color clr = new Color(r, g, b);
            
            craig.setBodyColor(clr);
          
            craig.turn(10);
        }
        craig.hide();
        bob.setPenWidth(3);
        bob.setBodyColor(Color.RED);
        bob.turn(45);
        bob.forward(40);
        bob.turnLeft();
        bob.forward(40);
        bob.turnLeft();
        bob.forward(40);
        bob.turnLeft();
        bob.forward(100);
        bob.forward(40);
        bob.turnLeft();
        bob.forward(40);
        bob.turnLeft();
        bob.forward(40);
        bob.turnLeft();
        bob.forward(40);
        bob.setBodyColor(Color.BLUE);
        bob.forward(40);
        bob.turnRight();
        bob.forward(60);
        bob.turnRight();
        bob.forward(40);
        bob.hide();
        bill.setBodyColor(Color.GREEN);
        bill.setPenColor(Color.PINK);
        bill.setPenWidth(2);
        bill.forward(40);
        bill.turnRight();
        bill.forward(40);
        bill.turnRight();
        bill.forward(40);
        bill.turnRight();
        bill.forward(40);
        bill.turnRight();
        bill.turn(-45);
        bill.forward(40);
        bill.turn(45);
        bill.forward(40);
        bill.turnRight();
        bill.forward(40);
        bill.turn(45);
        bill.forward(40);
        bill.penUp();
        bill.forward(100);
        
        
       
        
        
        
        
       
        
        
        
        
    }
}