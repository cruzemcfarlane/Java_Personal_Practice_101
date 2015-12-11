import javax.swing.JFrame;

public class LeftRight
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("LeftRight");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        LeftRightPanel panel = new LeftRightPanel();
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}