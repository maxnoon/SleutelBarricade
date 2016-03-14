package sleutelbarricade;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;


public class PressListener implements KeyListener
{
    public PressListener()
    {
        
    }

    @Override
    public void keyTyped(KeyEvent ke)
    {
        
    }

   @Override
    public void keyPressed(KeyEvent ke)
    {
        int key = ke.getKeyCode();
        if (key == KeyEvent.VK_UP)
        {
           
            Scherm.speler.moveUp();
        }
        if (key == KeyEvent.VK_DOWN)
        {
            Scherm.speler.moveDown();
        }
        if (key == KeyEvent.VK_LEFT)
        {
            Scherm.speler.moveLeft();
        }
        if (key == KeyEvent.VK_RIGHT)
        {
            Scherm.speler.moveRight();
        }
        
        
        
    
    }
    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
