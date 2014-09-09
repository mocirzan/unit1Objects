import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Image
{
    public static void main(String[] args) throws Exception
    {
        URL imagelocation = new URL(
            "http://horstmann.com/java4everyone/duke.gif");
        JOptionPane.showMessageDialog(null, "WHAT", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageICON(imageLocation));
        }
    }
        