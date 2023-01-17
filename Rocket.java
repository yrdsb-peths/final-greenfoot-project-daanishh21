import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player character or rocket that will be fighting off the asteroids.
 * 
 * @author (daanish) 
 * @version (January 2023)
 */
public class Rocket extends Actor
{
    GifImage myGif = new GifImage("rocket-fire-unscreen.gif");
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // sets the gif image so that it works
        setImage(myGif.getCurrentImage());
        moveTheRocket();
        
        if (Greenfoot.isKeyDown("space"))
        {
            shoot();
        }

    }
    
    // shooting the projectile
    private void shoot()
    {
        Blaster blaster = new Blaster();
        getWorld().addObject(blaster, getX(), getY());
    }
    
    // casual movement for the rocket at the speed of 8.
    public void moveTheRocket()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 9,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 9,getY());
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY() - 9);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY() + 9);
        }
        
        // added movement controls for "wasd" keys along with arrow keys
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 9,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 9,getY());
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY() - 9);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY() + 9);
        }

    }
    
    
}