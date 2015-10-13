package pkg2048;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Scherm
{
    public Scherm()
    {
        maakScherm();
    }
    
    public void maakScherm()
    {
        JFrame frame = new JFrame();
        
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setTitle("2048");
        
        //JPanel panel = new JPanel(new GridLayout(4, 4));
        
        //JLabel label = new JLabel("Test");
        //panel.add(label, panel);
        frame.repaint();
        frame.setVisible(true);
        frame.repaint();
        
    }
    
    public void paintComponent(Graphics g)
    {
        paintComponent(g);
        g.drawRect(10/*x*/, 10/*y*/, 80/*width*/, 30/*hight*/);
        g.drawString("TextToDraw", 25/*x*/, 25/*y*/);
    }
}
