import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sarpe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sarpe extends Inamici
{
    /**
     * Act - do whatever the Sarpe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean susjos;
    int speed=2;
    public Sarpe(boolean susSIjos)
    {getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
    susjos=susSIjos;
}
    public void act() 
    {
     MoveAround();
     InamicLovestePerete();
    
    }  
    public void InamicLovestePerete()
    {
    if(hitWalls()==true || isAtEdge())
    speed= -speed;
    }
    private void MoveAround()
    {
    int x=getX(), y=getY();
    if(susjos==true)
    setLocation(x,y+speed);
    else if(susjos==false)
      setLocation(x+speed,y);
    }
    
}
