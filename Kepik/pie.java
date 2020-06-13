import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * 
 * Andy
 * 
 */
public class pie extends Actor
{
    /**
     * Act - do whatever the pie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation(x, y + 1);
        
        if (getY() ==499)
        {
            setLocation(getX(),0);
        }
        
        setLocation(getX(),getY() +1);
        if (getY() == 450){
            ((latar) getWorld()).selesai();
            Greenfoot.playSound("buzz.wav");
        }
    }    
    
}
