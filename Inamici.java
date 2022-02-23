import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inamici here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inamici extends Alergatori
{
    /**
     * Act - do whatever the Inamici wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void AjunsLaMargine()
    {int x=getX(), y=getY(), WorldWidth=getWorld().getWidth() - 1, WorldHeight=getWorld().getHeight() - 1;
    if(x >= WorldWidth)
    setLocation(1,y);
     if(x <= 0)
    setLocation(WorldWidth-1,y);
     if(y >= WorldHeight)
    setLocation(x,1);
     if(x <= 0)
    setLocation(x,WorldHeight-1);
    }
}
