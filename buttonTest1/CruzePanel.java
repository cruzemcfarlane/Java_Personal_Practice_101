import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CruzePanel extends JPanel
{
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private int count;
    
    public CruzePanel()
    {
        setBackground(Color.blue);
        setPreferredSize(new Dimension(300, 40));
        
        count = 0;
        
        label = new JLabel("Pressed: " + count);
        
        button =  new JButton("Press Me!");        
        CruzeListener listener = new CruzeListener();
        button.addActionListener(listener);
        
        add(label);
        add(button);
    }
    
    private class CruzeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            count++;
            label.setText("Pressed: " + count);
        }
    }
}
