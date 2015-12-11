import java.awt.*;
import javax.swing.*;

public class QuoteOption
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Quote Option");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        QuoteOptionPanel panel = new QuoteOptionPanel();
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}