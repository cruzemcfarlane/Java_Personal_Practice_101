import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuoteOptionPanel extends JPanel
{
    private JLabel quote;
    private JRadioButton comedy, philosophy, carpentry;
    private String comedyQuote, philosophyQuote, carpentryQuote;
    
    public QuoteOptionPanel()
    {
        setBackground(Color.red);
        setPreferredSize(new Dimension(300, 100));
        
        comedy = new JRadioButton("Comedy", false);
        comedy.setBackground(Color.blue);
        philosophy = new JRadioButton("Philosophy", false);
        philosophy.setBackground(Color.orange);
        carpentry = new JRadioButton("Carpentry", false);
        carpentry.setBackground(Color.green);
        
        ButtonGroup group = new ButtonGroup();
        group.add(comedy);
        group.add(philosophy);
        group.add(carpentry);
        
        comedyQuote = "Take my wife, please";
        philosophyQuote = "I think, therefore I am.";
        carpentryQuote = "Measure twice. Cut once.";
        
        quote = new JLabel(philosophyQuote);
        quote.setFont(new Font("Helvetica", Font.BOLD, 24));
        
        QuoteListener listener = new QuoteListener();
        comedy.addActionListener(listener);
        philosophy.addActionListener(listener);
        carpentry.addActionListener(listener);
        
        add(quote);
        add(comedy);
        add(philosophy);
        add(carpentry);
    }
    
    private class QuoteListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            Object source = event.getSource();
            
            if(source == comedy)
            {
                quote.setText(comedyQuote);
            }
            
            else if(source == philosophy)
            {
                quote.setText(philosophyQuote);
            }
            
            else if(source == carpentry)
            {
                quote.setText(carpentryQuote);
            }
        }
    }
}