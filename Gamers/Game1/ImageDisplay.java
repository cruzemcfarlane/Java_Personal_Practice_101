package Game1;

import java.awt.*;
import javax.swing.*;//ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ImageDisplay extends JPanel
{
    //private ImageIcon image1, image2;
    //private JLabel label1, label2;
    
    ImageDisplay()
    {
         ImageIcon icon = new ImageIcon("river.jpg");
         ImageIcon icon1 = new ImageIcon("row1.GIF");
         
         JLabel label1 = new JLabel(icon); 
         JLabel label2 = new JLabel(icon1); 
         
         add(label1);
         add(label2);         
        
    }
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Cruze Game");

        frame.add(new ImageDisplay());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);          
    }
}