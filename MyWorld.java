import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Wall wall = new Wall();
        addObject(wall,11*50,0*50);
        wall.setLocation(12*50,0*50);
        wall.setLocation(11*50,2*50);
        wall.setLocation(13*50,2*50);
        wall.setLocation(12*50,2*50);
        wall.setLocation(2*50,11*50);
        Wall wall2 = new Wall();
        addObject(wall2,1*50,2*50);
        wall2.setLocation(2*50,2*50);
        Wall wall3 = new Wall();
        addObject(wall3,2*50,3*50);
        Wall wall4 = new Wall();
        addObject(wall4,11*50,0*50);
        wall4.setLocation(12*50,0*50);
        wall4.setLocation(2*50,0*50);
        wall4.setLocation(2*50,0*50);
        wall4.setLocation(2*50,1*50);
        wall2.setLocation(2*50,2*50);
        wall2.setLocation(2*50,2*50);
        wall3.setLocation(2*50,3*50);
        Wall wall5 = new Wall();
        addObject(wall5,2*50,4*50);
        wall5.setLocation(2*50,4*50);
        wall5.setLocation(2*50,4*50);
        removeObject(wall5);
        wall4.setLocation(2*50,1*50);
        wall4.setLocation(10*50,0*50);
        wall4.setLocation(11*50,0*50);
        wall2.setLocation(11*50,1*50);
        wall3.setLocation(11*50,2*50);
        Wall wall6 = new Wall();
        addObject(wall6,11*50,4*50);
        Wall wall7 = new Wall();
        addObject(wall7,11*50,5*50);
        Wall wall8 = new Wall();
        addObject(wall8,11*50,6*50);
        Wall wall9 = new Wall();
        addObject(wall9,11*50,7*50);
        Wall wall10 = new Wall();
        addObject(wall10,11*50,8*50);
        Wall wall11 = new Wall();
        addObject(wall11,11*50,9*50);
        Wall wall12 = new Wall();
        addObject(wall12,11*50,10*50);
        Wall wall13 = new Wall();
        addObject(wall13,11*50,11*50);
        wall.setLocation(0*50,11*50);
        wall12.setLocation(8*50,10*50);
        wall12.setLocation(9*50,10*50);
        wall.setLocation(9*50,11*50);
        Wall wall14 = new Wall();
        addObject(wall14,8*50,10*50);
        Wall wall15 = new Wall();
        addObject(wall15,7*50,10*50);
        Wall wall16 = new Wall();
        addObject(wall16,6*50,10*50);
        Wall wall17 = new Wall();
        addObject(wall17,5*50,10*50);
        Wall wall18 = new Wall();
        addObject(wall18,2*50,11*50);
        Wall wall19 = new Wall();
        addObject(wall19,2*50,10*50);
        Wall wall20 = new Wall();
        addObject(wall20,2*50,9*50);
        Wall wall21 = new Wall();
        addObject(wall21,5*50,9*50);
        Wall wall22 = new Wall();
        addObject(wall22,5*50,8*50);
        Wall wall23 = new Wall();
        addObject(wall23,4*50,7*50);
        Wall wall24 = new Wall();
        addObject(wall24,3*50,7*50);
        Wall wall25 = new Wall();
        addObject(wall25,1*50,7*50);
        wall25.setLocation(0*50,7*50);
        Wall wall26 = new Wall();
        addObject(wall26,0*50,8*50);
        Wall wall27 = new Wall();
        addObject(wall27,3*50,11*50);
        Wall wall28 = new Wall();
        addObject(wall28,3*50,10*50);
        wall28.setLocation(4*50,9*50);
        Wall wall29 = new Wall();
        addObject(wall29,2*50,6*50);
        Wall wall30 = new Wall();
        addObject(wall30,2*50,5*50);
        Wall wall31 = new Wall();
        addObject(wall31,0*50,4*50);
        Wall wall32 = new Wall();
        addObject(wall32,0*50,3*50);
        Wall wall33 = new Wall();
        addObject(wall33,3*50,4*50);
        Wall wall34 = new Wall();
        addObject(wall34,3*50,3*50);
        Wall wall35 = new Wall();
        addObject(wall35,2*50,2*50);
        Wall wall36 = new Wall();
        addObject(wall36,2*50,1*50);
        wall36.setLocation(2*50,1*50);
        Wall wall37 = new Wall();
        addObject(wall37,4*50,5*50);
        Wall wall38 = new Wall();
        addObject(wall38,9*50,8*50);
        Wall wall39 = new Wall();
        addObject(wall39,10*50,8*50);
        Wall wall40 = new Wall();
        addObject(wall40,7*50,8*50);
        Wall wall41 = new Wall();
        addObject(wall41,7*50,9*50);
        Wall wall42 = new Wall();
        addObject(wall42,9*50,7*50);
        Wall wall43 = new Wall();
        addObject(wall43,9*50,6*50);
        Wall wall44 = new Wall();
        addObject(wall44,9*50,4*50);
        Wall wall45 = new Wall();
        addObject(wall45,9*50,3*50);
        Wall wall46 = new Wall();
        addObject(wall46,9*50,2*50);
        Wall wall47 = new Wall();
        addObject(wall47,9*50,1*50);
        Wall wall48 = new Wall();
        addObject(wall48,9*50,0*50);
        wall47.setLocation(8*50,2*50);
        Wall wall49 = new Wall();
        addObject(wall49,7*50,3*50);
        Wall wall50 = new Wall();
        addObject(wall50,6*50,4*50);
        Wall wall51 = new Wall();
        addObject(wall51,6*50,5*50);
        Wall wall52 = new Wall();
        addObject(wall52,7*50,6*50);
        Wall wall53 = new Wall();
        addObject(wall53,5*50,3*50);
        Wall wall54 = new Wall();
        addObject(wall54,5*50,2*50);
        Wall wall55 = new Wall();
        addObject(wall55,4*50,1*50);
        Wall wall56 = new Wall();
        addObject(wall56,6*50,0*50);
        Wall wall57 = new Wall();
        addObject(wall57,11*50,3*50);
        Wall wall58 = new Wall();
        addObject(wall58,150,599);
        Wall wall59 = new Wall();
        addObject(wall59,100,599);
        Wall wall60 = new Wall();
        addObject(wall60,449,594);
        Wall wall61 = new Wall();
        addObject(wall61,550,598);
        wall60.setLocation(451,577);
        wall60.setLocation(450,583);
        wall60.setLocation(397,571);
        wall60.setLocation(441,578);
        wall60.setLocation(446,600);
        wall60.setLocation(459,591);
        wall60.setLocation(462,583);
        wall60.setLocation(469,586);
        wall60.setLocation(450,586);
        Wall wall62 = new Wall();
        addObject(wall62,597,448);
        wall62.setLocation(593,450);
        Wall wall63 = new Wall();
        addObject(wall63,596,551);
        wall63.setLocation(584,543);
        wall63.setLocation(584,543);
        wall63.setLocation(592,545);
        wall63.setLocation(592,544);
        Soarece soarece = new Soarece(5);
        addObject(soarece,42,562);
        soarece.setLocation(40,566);
        soarece.setLocation(34,571);

        wall63.setLocation(585,551);
        wall63.setLocation(584,539);
        wall63.setLocation(584,508);
        wall63.setLocation(532,502);
        removeObject(wall63);
        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,384,561);
        SpeedBoost speedBoost2 = new SpeedBoost();
        addObject(speedBoost2,195,396);
        SpeedBoost speedBoost3 = new SpeedBoost();
        addObject(speedBoost3,147,248);
        SpeedBoost speedBoost4 = new SpeedBoost();
        addObject(speedBoost4,295,144);
        SpeedBoost speedBoost5 = new SpeedBoost();
        addObject(speedBoost5,299,446);
        SpeedBoost speedBoost6 = new SpeedBoost();
        addObject(speedBoost6,397,150);
        speedBoost6.setLocation(394,153);
        speedBoost4.setLocation(302,152);
        speedBoost4.setLocation(302,154);
        speedBoost3.setLocation(150,253);
        speedBoost2.setLocation(200,400);
        speedBoost.setLocation(402,564);
        Pasare pasare = new Pasare();
        addObject(pasare,497,245);
        Pasare pasare2 = new Pasare();
        addObject(pasare2,492,41);
        Pasare pasare3 = new Pasare();
        addObject(pasare3,495,446);
        Sarpe sarpe = new Sarpe(true);
        addObject(sarpe,247,198);
        speedBoost6.setLocation(396,154);
        Sarpe sarpe2 = new Sarpe(true);
        addObject(sarpe2,396,154);
        Sarpe sarpe3 = new Sarpe(false);
        addObject(sarpe3,247,42);
        Sarpe sarpe4 = new Sarpe(false);
        addObject(sarpe4,48,394);
        pasare3.setLocation(497,449);
        PoartaDeIesire poartaDeIesire = new PoartaDeIesire();
        addObject(poartaDeIesire,576,503);
        poartaDeIesire.setLocation(590,584);
    }
}
