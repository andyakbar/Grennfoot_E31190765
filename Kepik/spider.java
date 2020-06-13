import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * 
 * Andy
 * 
 */
public class spider extends Actor
{
    /**
     * Act - do whatever the spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation (x, y + 1);
        
        if (getY() ==499)
        {
            setLocation(getX(),0);
        }
        
        
        kepik b= (kepik)getOneIntersectingObject(kepik.class);
        if (b!=null)
        {
            setImage ("skull.png");
            Greenfoot.playSound("buzz.wav");
            getWorld().removeObject(b);
            return;
        }
    }    
}
