import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pasare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pasare extends Inamici
{
    /**
     * Act - do whatever the Pasare wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pasare()
    {  getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);}
    public void act() 
    {
     move(4);
     AjunsLaMargine();
    }    
}
