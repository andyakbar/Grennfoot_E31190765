import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

/**
 * 
 * Andy
 * 
 */
public class papanskor extends Actor
{
    /**
     * Act - do whatever the papanskor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final float besarhuruf = 48.0f;
    public static final int lebar = 500;
    public static int tinggi = 300;
    
    public papanskor(int skor)
    {
        bikinGambar("Game Over","Skor Akhir : ", skor);
    }
    
    private void bikinGambar(String judul, String depan, int skor)
    {
        GreenfootImage gambar = new GreenfootImage(lebar,tinggi);
        gambar.setColor (new Color (25, 5, 74, 160));
        gambar.fillRect(0,0, lebar-10, tinggi -10);
        Font font = gambar.getFont();
        gambar.setColor(Color.GREEN);
        gambar.drawString(judul,60, 100);
        gambar.drawString(depan+skor,60,200);
        setImage(gambar);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
