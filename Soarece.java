import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soarece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soarece extends Fugar
{
    /**
     * Act - do whatever the Soarece wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   int NrVieti;
    public Soarece(int Vieti)
    {
       getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
       NrVieti=Vieti;
    }
    public void act() 
    {
       SlideAround();
       CollectBoost();
       maxSpeed();
       PierdereVieti();
       LovireInamic();
       victorie();
       AiPierdut();
       
    } 
    public void LovireInamic()
    {
    if(HitInamici()==true)
     setLocation(40,566);
    }
    public void PierdereVieti()
    {
    if(HitInamici()==true)
    NrVieti--;
    }
    public void AiPierdut()
    {
     if(NrVieti==0)
     {getWorld().addObject(new NotificareInfrangere(),getWorld().getWidth()/2,getWorld().getHeight()/2);
        Greenfoot.stop();}
    }
}
