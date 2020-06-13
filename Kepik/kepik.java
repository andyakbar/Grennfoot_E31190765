import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * 
 * Andy
 * 
 */
public class kepik extends Actor
{
    /**
     * Act - do whatever the kepik wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
        public void act() 
    {
        if(Greenfoot.mouseMoved(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        
        // Pop
        if(Greenfoot.mouseClicked(null)) {
            int x = -getImage().getWidth()/2;
            int y = getImage().getHeight()/2;
            pie pie = (pie) getOneObjectAtOffset(x , y, pie.class);
            if(pie != null) {
            ((latar) getWorld()).tambahNilai();
            Greenfoot.playSound("pop.wav");
            getWorld().removeObject(pie);
            return;
            }
        }
       
        pie a= (pie)getOneIntersectingObject(pie.class);
        if (a!=null)
        {
            ((latar) getWorld()).tambahNilai();
            Greenfoot.playSound("pop.wav");
            getWorld().removeObject(a);
            return;
        }     
        
        spider spider=(spider)getOneIntersectingObject(spider.class);
        if(spider !=null)
        {

            setImage("skull.png");
            setRotation(0);
            Greenfoot.playSound("buzz.wav");
            getWorld().removeObject(spider);
            Greenfoot.stop();
            ((latar) getWorld()).selesai();
        }
       
    }    
}
