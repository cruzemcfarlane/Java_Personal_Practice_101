import javax.swing.*;
import java.awt.*;

public class TabbedPane
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Cruze");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane tab = new JTabbedPane();
        tab.addTab("Cruze", new QuoteOptionPanel());
        tab.addTab("Martinez", new StyleOptionPanel());
        tab.addTab("McFarlane", new LeftRightPanel());
        
        frame.getContentPane().add(tab);
        frame.pack(); 
        frame.setVisible(true);
    }
}