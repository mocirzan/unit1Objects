import java.lang.Object;
import java.awt.Color;
import java.util.Random;

public class TurtleLab2
{
    public static void main(String[] args)
    throws InterruptedException
    
    {
    
        World turtleworld = new World();
        Turtle glen = new Turtle(turtleworld);
        Turtle rob = new Turtle(turtleworld);
        Random rand = new Random();
        glen.setPenWidth(5);
        for(int i=1; i<1300; i++)
        {
            glen.forward(rand.nextInt(40));
            rob.forward(rand.nextInt(20));

           
            int r = rand.nextInt(255);
            int g = rand.nextInt(255);
            int b = rand.nextInt(255);
            Color clr = new Color(r, g, b);
            Color clr2 = new Color(2, g, b);
            
            glen.setBodyColor(clr);
            rob.setBodyColor(clr2);
          
            glen.turn(rand.nextInt(360));
            rob.turn(rand.nextInt(360));
            Thread.sleep(25);
        }
    }
}