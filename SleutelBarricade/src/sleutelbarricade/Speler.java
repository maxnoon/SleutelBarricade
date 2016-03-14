/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricade;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 *
 * @author max
 */
public class Speler extends JComponent {
private int i= 0;
 public ArrayList<Color> kleuren = new ArrayList<Color>();
     private int x;
     private int y;
     
     public Speler(int x, int y)
    {
        this.x = x;
        this.y = y;
        kleuren.add(Color.BLACK);      
        kleuren.add(Color.BLUE);
        kleuren.add(Color.CYAN);
        kleuren.add(Color.DARK_GRAY);
        kleuren.add(Color.GRAY);
        kleuren.add(Color.GREEN);
        kleuren.add(Color.LIGHT_GRAY);
        kleuren.add(Color.MAGENTA);
        kleuren.add(Color.ORANGE);
        kleuren.add(Color.PINK);
        kleuren.add(Color.RED);
        kleuren.add(Color.WHITE);
        kleuren.add(Color.YELLOW);

    }
    public void moveDown() 
    {
       this.y = y+1;
               if (i > 12){
            i=0;
        }
        else{
            i++;
        }
       Scherm.frame.revalidate();
        Scherm.frame.repaint();
    }

    public void moveUp() 
    {
        this.y=y-1;
                if (i > 12){
            i=0;
        }
        else{
            i++;
        }
        Scherm.frame.revalidate();
        Scherm.frame.repaint();
    }

    public void moveLeft() 
    {
        this.x=x-1;
                if (i > 12){
            i=0;
        }
        else{
            i++;
        }i++;
        Scherm.frame.revalidate();
        Scherm.frame.repaint();
    }

    public void moveRight() 
    {
        this.x=x+1;
        if (i > 12){
            i=0;
        }
        else{
            i++;
        }
        
        System.out.println(x);
        Scherm.frame.revalidate();
        Scherm.frame.repaint();
        
    }
     public void paintComponent(Graphics g)
    {
        
            
        
        
            g.setColor(kleuren.get(i));
            g.fillOval(this.x*25, this.y*25, 22, 22);

        
        System.out.println("paint");


       
        
    }
}
