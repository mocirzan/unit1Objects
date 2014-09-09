import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(640,480);
        Color myColor = new Color(200, 10, 255);
        System.out.println(myColor);
        myColor.darker();
        frame.getContentPane().setBackground(myColor.brighter());
        System.out.println(myColor.brighter());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

