package pkg2048;

import java.util.Random;
import java.util.Scanner;

/*/
 * Cees van Spaendonck
/*/

public class Spel
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input = "";
        
        Veld veld = new Veld();
        Scherm scherm = new Scherm();
        veld.waardes();
        System.out.print("Ben je ready? ");
        input = in.next();
        while(!input.equals("stop"))
        {
            System.out.print("Voer commando in: ");
            input = in.next();

            if(input.equals("rechts"))
            {
                System.out.println("rechts");
                veld.moveRechts();
                veld.nieuwRandom();
            }
            else if(input.equals("links"))
            {
                System.out.println("links");
                veld.moveLinks();
                veld.nieuwRandom();
            }
            else if(input.equals("onder"))
            {
                System.out.println("onder");
                veld.moveOnder();
                veld.nieuwRandom();
            }
            else if(input.equals("boven"))
            {
                System.out.println("boven");
                veld.moveBoven();
                veld.nieuwRandom();
            }
            else if(input.equals("random"))
            {
                System.out.println("nieuw random");
                veld.nieuwRandom();
            }
            else
            {
                System.out.println("wat?");
            }
            veld.waardes();
        }
        
    }

}
