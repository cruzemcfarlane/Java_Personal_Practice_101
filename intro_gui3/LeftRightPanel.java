import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeftRightPanel extends JPanel
{
    private JButton left, right;
    private JLabel label;
    private JPanel buttonPanel;
    
    public LeftRightPanel()
    {
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(200, 40));
        
        left = new JButton("Left");
        right = new JButton("Right");
        
        ButtonListener listener = new ButtonListener();
        left.addActionListener(listener);
        right.addActionListener(listener);
        
        label = new JLabel("Push a button");
        
        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.red);
        buttonPanel.setPreferredSize(new Dimension(200, 40));
        buttonPanel.add(left);
        buttonPanel.add(right);
        
        add(label);
        add(buttonPanel); 
    }
    
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            Object source = event.getSource();
            
            if(source == left)
            {
                label.setText("Left");
            }
            
            else
            {
                label.setText("Right");
            }
        }
    }
}