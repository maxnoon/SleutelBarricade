/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbarricade;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author max
 */
class Scherm {
    static JFrame frame = new JFrame();
    
    static Speler speler;
    public Scherm()
    {
        maakScherm();
        System.out.println("ehehehuehuehuehuehuheuhehuehuehuhe");
    }
    
   public void maakScherm()
   {
       
     
        frame.setSize(500, 500);
        frame.setTitle("SleutelBarricade");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);

        speler = new Speler(1,1);
        frame.add(speler);
        
        PressListener hoi = new PressListener();
        frame.addKeyListener(hoi);
        Scherm.frame.revalidate();
        Scherm.frame.repaint();
   }
}
