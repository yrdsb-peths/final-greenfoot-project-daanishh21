import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player character or rocket that will be fighting off the asteroids.
 * 
 * @author (daanish) 
 * @version (January 2023)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveTheRocket();
    }
    
    
    public void moveTheRocket()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 5,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 5,getY());
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY() - 5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY() + 5);
        }
        
        // added movement controls for "wasd" keys along with arrow keys
        
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 5,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 5,getY());
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY() - 5);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY() + 5);
        }
        
    }
    
}
