import java.awt.*;
import javax.swing.*;

public class CruzePanel extends JPanel
{
    public CruzePanel()
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.blue);
        
        ImageIcon icon = new ImageIcon("river.jpg");
        
        JLabel label = new JLabel(icon, SwingConstants.CENTER);
        
        add(label);
        
        panel.setPreferredSize(new Dimension(500, 500));       
    }
}