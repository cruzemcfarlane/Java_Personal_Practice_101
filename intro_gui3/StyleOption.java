import java.awt.*;
import javax.swing.*;

public class StyleOption
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame ("Style Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        StyleOptionPanel panel = new StyleOptionPanel();
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}