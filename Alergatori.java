import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alergatori here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alergatori extends Actor
{
    int speed=4;
    /**
     * Act - do whatever the Alergatori wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
public void maxSpeed()
{
 if(speed>=7)
 speed=6;
}
    public void MoveAndTurn()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(4);
        }
    }

    public void SlideAround()
    {
        int x=getX(),y=getY();
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x+speed, y);
            if(hitWalls()==true)
                setLocation(x-speed, y);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-speed, y);
            if(hitWalls()==true)
                setLocation(x+speed, y);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y-speed);
            if(hitWalls()==true)
                setLocation(x, y+speed);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y+speed);
            if(hitWalls()==true)
                setLocation(x, y-speed);
        }
    }

    public boolean hitWalls()
    {
        if(isTouching(Wall.class))
            return true;
        else return false;
    }
    public void CollectBoost()
 {
    if(isTouching(SpeedBoost.class))
    {
        speed++;
        removeTouching(SpeedBoost.class);
    }
    }
    public boolean HitInamici()
    {
      if(isTouching(Inamici.class))
      return true;
      else return false;
    }
}
