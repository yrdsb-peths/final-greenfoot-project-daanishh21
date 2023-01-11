import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The space world in which the rocket will fight off asteroids. 
 * 
 * @author (daanish) 
 * @version (January 2023)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // adding rocket to the world
        super(600, 600, 1);
        
        Rocket rocket = new Rocket();
        addObject(rocket, 300, 300);
        
    }
}
