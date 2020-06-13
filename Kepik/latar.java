import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;

/**
 * 
 * Andy
 * 
 */
public class latar extends World
{
    
    /**
     * Constructor for objects of class latar.
     * 
     */
    counter skor = new counter ("Skor : ");
    public void tambahNilai()
    {
        skor.tambah(1);
    }
    
    
    public void selesai()
    {
        addObject(new papanskor(skor.nilaiAkhir()), 450,250);
        Greenfoot.stop();
    }
    
    public void menang()
    {
        addObject (new papanskor(skor.nilaiAkhir()),152,100);
    }
    
    public latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        setPaintOrder(counter.class, kepik.class, pie.class);
          
        addObject(new kepik(), 200,250);
        addObject(new pie(),700,30);
        addObject(new spider(),500,30);
        addObject(skor,80,400);
        
        
    }
    
    public void act()
    
    {
        
        if(Greenfoot.getRandomNumber(100) < 2) {
            addObject(new pie(), Greenfoot.getRandomNumber(700), 10); 
        }
        if(Greenfoot.getRandomNumber(700) < 1) {
            addObject(new spider(), Greenfoot.getRandomNumber(500), 10);
        }
          
    }
    
    
    
    
}
