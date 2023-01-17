import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The projectile that will be shooting out of the rocket.
 * 
 * @author (daanish) 
 * @version (January 2023)
 */
public class Blaster extends Actor
{
    /**
     * Act - do whatever the Blaster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY() - 20);
        blast();
        Vanish();
    }
    
    // makes the blast vanish from the top of the screen so that the game is infinite.
    public void Vanish()
    {
        if(getY() == 0)
        {
            getWorld().removeObject(this);
        }
    }   
    
    // creates a loop in which one is destroyed and the next spawns.
    public void blast()
    {
        if(isTouching(asteroid.class))
        {
            removeTouching(asteroid.class);
            // world constructor
            MyWorld world = (MyWorld) getWorld();
            world.createAsteroid();
            world.increaseScore();
            // plays sound effect when hitting meteor
            Greenfoot.playSound("Laser blast.mp3");
        }
    }
    
    
    
}
