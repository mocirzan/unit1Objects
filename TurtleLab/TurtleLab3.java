import java.lang.Object;
import java.awt.Color;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TurtleLab3
{
    public static void main(String[] args) 
    {

        World turtleworld = new World();
        Turtle glen = new Turtle(turtleworld);
        if (keyCode == KeyEvent.VK_LEFT) 
        {
            glen.forward(100);

       
        }
    }
}