import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;

/**
 * 
 *andy
 * 
 */
public class counter extends Actor
{
    /**
     * Act - do whatever the counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int angka = 0;
    private int target = 0;
    private String huruf;
    private int panjangHuruf;
    
    public counter( String depan )
    {
        huruf = depan;
        panjangHuruf = (huruf.length() +2) *16;
        
        setImage (new GreenfootImage(panjangHuruf,24));
        GreenfootImage gambar = getImage();
        Font jenisHuruf = gambar.getFont();
        gambar.setFont(jenisHuruf.deriveFont(24.0F));
        
        gantiGambar();
    }
    
    private void gantiGambar()
    {
        GreenfootImage gambar = getImage();
        gambar.clear();
        
        gambar.setColor(Color.RED);
        
        gambar.drawString(huruf + angka, 1, 18);
    }
    
    public void tambah (int skor)
    {
        target += skor;
    }
    
    public int nilaiAkhir()
    {
        return angka;
    }
    
    
    public void act() 
    {
        if (angka < target)
        {
            angka++;
            gantiGambar();
        }
    }
}
