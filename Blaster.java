import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blaster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blaster extends Actor
{
    /**
     * Act - do whatever the Blaster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        blast();
    }
    
    public void blast()
    {
        if(isTouching(asteroid.class))
        {
            removeTouching(asteroid.class);
            MyWorld world = (MyWorld) getWorld();
            world.createAsteroid();
            world.increaseScore();
        }
    }
    
}
