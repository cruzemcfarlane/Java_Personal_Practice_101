import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StyleOptionPanel extends JPanel
{
    private JLabel label;
    private JCheckBox bold, italic;
    
    public StyleOptionPanel()
    {
        setBackground(Color.blue);
        setPreferredSize(new Dimension(300, 100));
        
        label = new JLabel("Say it with style");
        label.setFont(new Font("Ariel", Font.PLAIN, 36));
        
        bold = new JCheckBox("Bold");
        bold.setBackground(Color.red);
        
        italic = new JCheckBox("Italic");
        italic.setBackground(Color.red);
        
        StyleListener listener = new StyleListener();
        bold.addItemListener(listener);
        italic.addItemListener(listener);
        
        add(label);
        add(bold);
        add(italic);
    }
    
    private class StyleListener implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            int style = Font.PLAIN;
            
            if(bold.isSelected())
            {
                style = Font.BOLD;
            }
            
            if(italic.isSelected())
            {
                style += Font.ITALIC;
            }
            
            label.setFont(new Font("Ariel", style, 36));
        }        
    }
}