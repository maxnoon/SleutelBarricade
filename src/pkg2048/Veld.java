package pkg2048;

import java.util.Random;

public final class Veld
{
    public final int size = 4;
    public Blok[][] grid;
    
    public Veld()
    {
        grid = new Blok[size][size];
        vormGrid();
    }
    
    public void vormGrid()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                Blok blok = new Blok();
                blok.x = j;
                blok.y = i;
                blok.waarde = 0;
                grid[i][j] = blok;               
            }
        }
        nieuwRandom();
    }
   
    public void waardes()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(grid[i][j].waarde + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void moveRechts()
    {
        for (int y = 0; y < size; y++)
        {
            for (int x = 0; x < size; x++)
            {
                if(x != (size - 1))
                {
                    if(grid[y][(x + 1)].waarde == 0)
                    {
                        grid[y][(x + 1)].waarde = grid[y][x].waarde;
                        grid[y][x].waarde = 0;
                        //nieuwRandom();
                        //break;
                    }
                    else if(grid[y][(x + 1)].waarde == grid[y][x].waarde)
                    {
                        
                        grid[y][(x + 1)].waarde = grid[y][x].waarde * 2;
                        grid[y][x].waarde = 0;
                        //nieuwRandom();
                        //break;
                    }
                }
            }
        }
    }
    
    public void moveLinks()
    {
        for (int y = 0; y < size; y++)
        {
            for (int x = 3; x > 0; x--)
            {
                if(x != 0)
                {
                    if(grid[y][(x - 1)].waarde == 0)
                    {
                        grid[y][(x - 1)].waarde = grid[y][x].waarde;
                        grid[y][x].waarde = 0;
                        //nieuwRandom();
                        //break;
                    }
                    else if(grid[y][(x - 1)].waarde == grid[y][x].waarde)
                    {
                        grid[y][(x - 1)].waarde = grid[y][x].waarde * 2;
                        grid[y][x].waarde = 0;
                        //nieuwRandom();
                        //break;
                    }
                }
            }
        }
    }
    
    public void moveBoven()
    {
        for (int x = 0; x < size; x++)
        {
            for (int y = 3; y > 0; y--)
            {
                if(y != 0)
                {
                    if(grid[(y - 1)][x].waarde == 0)
                    {
                        grid[(y - 1)][x].waarde = grid[y][x].waarde;
                        grid[y][x].waarde = 0;
                        //nieuwRandom();
                        //break;
                    }
                    else if(grid[(y - 1)][x].waarde == grid[y][x].waarde)
                    {
                        grid[(y - 1)][x].waarde = grid[y][x].waarde * 2;
                        grid[y][x].waarde = 0;
                        //nieuwRandom();
                        //break;
                    }
                }
            }
        }
    }
    
    public void moveOnder()
    {
        for (int x = 0; x < size; x++)
        {
            for (int y = 0; y < size; y++)
            {
                if(y != (size - 1))
                {
                    if(grid[(y + 1)][x].waarde == 0)
                    {
                        grid[(y + 1)][x].waarde = grid[y][x].waarde;
                        grid[y][x].waarde = 0;
                        //nieuwRandom();
                        //break;
                    }
                    else if(grid[(y + 1)][x].waarde == grid[y][x].waarde)
                    {
                        grid[(y + 1)][x].waarde = grid[y][x].waarde * 2;
                        grid[y][x].waarde = 0;
                        //nieuwRandom();
                        //break;
                    }
                }
            }
        }
    }
    
    public void nieuwRandom()
    {
        Random rand = new Random();

        int randomCijfer = rand.nextInt(2);
        if(randomCijfer == 1)
        {
            randomCijfer = 2;
        }
        else
        {
            randomCijfer = 4;
        }
        
        int x = rand.nextInt(4);
        int y = rand.nextInt(4);
        
        if(grid[y][x].waarde == 0)
        {
            grid[y][x].waarde = randomCijfer;
        }
        else
        {
            nieuwRandom();
        }
    }
}
