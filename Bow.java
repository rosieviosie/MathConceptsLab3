import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bow extends Actor
{
   private final static double ARROW_VELOCITY = 1500.0;  
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
    if (mouse != null)
    {
        Vector2D bowArrowToMouse = new Vector2D(mouse.getX() - getX(), mouse.getY() - getY());
        
        alignWithVector(bowArrowToMouse);
        
       if (Greenfoot.mouseClicked(null)) 
        {
            bowArrowToMouse.normalize();
            bowArrowToMouse = Vector2D.multiply(bowArrowToMouse, ARROW_VELOCITY);
            
            Arrow arrow = new Arrow();
            arrow.setVelocity(bowArrowToMouse);
            getWorld().addObject(arrow, getX(), getY());
            //Greenfoot.playSound("cannonSound.wav");
         
        }
    }
}

 public void alignWithVector(Vector2D v) {
    double adjacent = v.getX();
        double opposite = v.getY();
        
        double angleRadians = Math.atan2(opposite, adjacent);
        double angleDegrees = Math.toDegrees(angleRadians);
        
        setRotation((int) angleDegrees);
        
}
}
