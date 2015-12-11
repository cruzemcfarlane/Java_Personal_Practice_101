import java.awt.*;
import javax.swing.*;

public class CruzePanel extends JPanel
{
    private JPanel panel;
    private JLabel label;
    
    public CruzePanel()
    {
        panel = new JPanel();
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(200, 75));
        
        label = new JLabel("Cruze is my name!");
        
        add(label);
    }
}