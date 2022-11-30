import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pigeon extends Actor
{
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        List<Arrow> arrow = getWorld().getObjects(Arrow.class);
        
        for (int i = 0; i < arrow.size(); i++)
        {
            Arrow arrow2 = arrow.get(i);
            
            Vector2D targetToArrow = new Vector2D(arrow2.getX() - getX(), arrow2.getY() - getY());
            double distance = targetToArrow.magnitude();
            
            double arrowRadius = arrow2.getImage().getHeight() / 2;
            double targetRadius = getImage().getHeight() / 2;
            
            if (distance < arrowRadius + targetRadius)
            {
                setImage("pigeon3.png");
                Greenfoot.playSound("explosion.wav");
            }
        }
    }
}