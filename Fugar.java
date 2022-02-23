import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fugar extends Alergatori
{
    /**
     * Act - do whatever the Fugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void victorie()
    {
     if(isTouching(PoartaDeIesire.class))
     {getWorld().addObject(new NotificareVictorie(),getWorld().getWidth()/2,getWorld().getHeight()/2);
     Greenfoot.stop();}
    }
}
