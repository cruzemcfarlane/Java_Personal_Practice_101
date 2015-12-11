package Game1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;//KeyAdapter;
//import java.awt.event.KeyEvent;

public class CruzeGame extends JFrame implements Runnable
{
    int x, y, vx, vy;
    
    private Image dbImage, raft1, raft2;
    private Graphics dbGraphics;
    
    public void run()
    {
        try
        {
            while(true)
            {
                move();
                Thread.sleep(5);
            }
        }
        
        catch(Exception e){}
    }
    
    public void move()
    {
        x += vx;
        y += vy;
            
        if(x <= 0)
        {
            x = 0;
        }    
                
        if(x >= 475)
        {
            x = 475;
        }          
            
        if(y <= 0)
        {
            y = 500;
        }
                
        if(y >= 475)
        {
            y = 475;
        }        
    }
        
    public void setVX(int v)
        {
            vx = v;
        }
        
    public void setVY(int v)
        {
            vy = v;
        }
    
    public class AL extends KeyAdapter 
    {
        public void keyPressed(KeyEvent e)
        {
            int keyCode = e.getKeyCode();
            
            if(keyCode == e.VK_LEFT)
            {
                setVX(-1);        
            }
            
            else if (keyCode == e.VK_RIGHT)
            {
                setVX(+1);                
            }
            
            else if(keyCode == e.VK_UP)
            {
                setVY(-1);
            }
            
            else if(keyCode == e.VK_DOWN)
            {
                setVY(+1);
            }
        }
        
        public void keyReleased(KeyEvent e)
        {
            int keyCode = e.getKeyCode();
            
            if(keyCode == e.VK_LEFT)
            {
                setVX(0);                          
            }
            
            else if (keyCode == e.VK_RIGHT)
            {
                setVX(0);
            }
            
            else if(keyCode == e.VK_UP)
            {
                setVY(0);
            }
            
            else if(keyCode == e.VK_DOWN)
            {
                setVY(0);
            }
        }
    }
          
    public CruzeGame() 
    {
        ImageIcon boat = new ImageIcon("row1.GIF"); 
        raft1 = boat.getImage();
        
        ImageIcon sea = new ImageIcon("river.jpg"); //Background Image 
        raft2 = sea.getImage();
        
        JLabel label = new JLabel(sea);
        
        JPanel panel = new JPanel();
       
        
        panel.add(label);
        JFrame frame = new JFrame("Cruzer");
        frame.getContentPane().add(panel);
        
        addKeyListener(new AL());
        //setTitle("Cruze Game");
        setSize(500, 500);
        setResizable(false);
        setVisible(true);   
        setBackground(Color.red);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        x = 250;
        y = 250;
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
       g.drawImage(raft1, x, y, this);
       repaint();
     }
            
    public static void main(String[] args)
    {
        CruzeGame game = new CruzeGame();
        Thread t1 = new Thread(game);
        t1.start();        
    }    
}    