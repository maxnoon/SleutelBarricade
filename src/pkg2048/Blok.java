package pkg2048;

import java.awt.Color;

class Blok
{
    public int waarde, x, y;
    public Color kleur;
    
    public Blok()
    {
        this.waarde = 0;
        this.kleur = getKleur(this.waarde);
    }
    
    public Color getKleur(int waarde)
    {
        Color kleur = null;
        if(waarde == 2)
        {
            kleur = Color.getHSBColor(246, 246, 232);
        }
        return kleur;
    }
    
    public void setWaarde(int waarde)
    {
        waarde = waarde;
    }
}
