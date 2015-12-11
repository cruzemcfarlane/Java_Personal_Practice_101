import java.awt.*;
import javax.swing.*;
import java.awt.event.*;//KeyAdapter;
//import java.awt.event.KeyEvent;

public class CruzeGame extends JFrame
{
    int x, y;
    private Image dbImage;
    private Graphics dbGraphics;
    
    public class AL extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            int keyCode = e.getKeyCode();
            
            if(keyCode == e.VK_LEFT)
            {
                if(x <= 0)
                {
                    x = 460;
                }
                
                else
                {
                    x-=5;
                }
            }
            
            else if (keyCode == e.VK_RIGHT)
            {
                if(x >= 460)
                {
                   x = 0; 
                }
                
                else
                {
                    x+=5;
                }
            }
            
            else if(keyCode == e.VK_UP)
            {
                if(y <= 40)
                {
                    y = 460;
                }
                
                else
                {
                    y-=5;
                }
            }
            
            else if(keyCode == e.VK_DOWN)
            {
                if (y >= 460)
                {
                    y = 0;
                }
                
                else
                {
                    y+=5;
                }
            }
        }
        
        public void keyReleased(KeyEvent e){}
    }
            
    public CruzeGame()
    {
        addKeyListener(new AL());
        setTitle("Cruze Game");
        setSize(500, 500);
        setResizable(false);
        setVisible(true);     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        x = 150;
        y = 150;
    }
    
    public void paint(Graphics g)
    {
        dbImage = createImage(getWidth(), getHeight());
        dbGraphics = dbImage.getGraphics();
        paintComponent(dbGraphics);
        g.drawImage(dbImage, 0, 0, this);
    }
    
    public void paintComponent(Graphics g)
    {
        g.fill3DRect(x, y, 30, 30, true);
        //g.drawOval(x, y, 30, 30);
        repaint();
        //g.drawString("Cruze McFarlane", 200, 250);
    }
    
    public static void main(String[] args)
    {
        new CruzeGame();
        //System.out.print("Love");
    }
}