import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Rocket Ride", 70);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 300, 170);
        prepare();
    }

    // the main world act loop

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket, 300, 400);
        rocket.setLocation(300, 75);
        Label label = new Label("Use the Arrows Keys or WASD to Move", 35);
        addObject(label, 300, 280);
        label.setLocation(300, 250);
        Label label2 = new Label("PRESS SPACE TO START", 40);
        addObject(label2, 249, 331);
        label2.setLocation(300, 319);
        
    }
}
