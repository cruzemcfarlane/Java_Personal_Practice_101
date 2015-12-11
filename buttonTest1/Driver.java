import java.awt.*;
import javax.swing.*;

public class Driver
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Driver");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CruzePanel panel = new CruzePanel();
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}