import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    public MyWorld()
    {    
        super(600, 400, 1, false);

        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; // seems to be the default
        prepare();
    }

    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pigeon pigeon = new Pigeon();
        addObject(pigeon,429,126);
        pigeon.setLocation(551,63);
        Pigeon pigeon2 = new Pigeon();
        addObject(pigeon2,400,68);
        Pigeon pigeon3 = new Pigeon();
        addObject(pigeon3,500,183);
        Pigeon pigeon4 = new Pigeon();
        addObject(pigeon4,242,67);
        Pigeon pigeon5 = new Pigeon();
        addObject(pigeon5,313,168);
        Pigeon pigeon6 = new Pigeon();
        addObject(pigeon6,72,65);
        Pigeon pigeon7 = new Pigeon();
        addObject(pigeon7,155,153);
        pigeon3.setLocation(490,137);
        pigeon5.setLocation(330,128);
        pigeon4.setLocation(232,42);
        pigeon6.setLocation(48,54);
        pigeon7.setLocation(132,135);
        pigeon4.setLocation(199,46);
        pigeon5.setLocation(285,126);
        pigeon2.setLocation(352,39);
        pigeon3.setLocation(416,115);
        pigeon.setLocation(488,60);
        Pigeon pigeon8 = new Pigeon();
        addObject(pigeon8,554,114);
        Bow bow = new Bow();
        addObject(bow,66,317);
    }
}
