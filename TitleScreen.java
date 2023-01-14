import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen of game.
 * 
 * @author (daanish) 
 * @version (January 2023)
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

        addObject(titleLabel, 300, 239);
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

    // preparing world for start.
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket, 300, 130);
        rocket.setLocation(300, 115);
        
        Label label2 = new Label("PRESS SPACE TO START", 45);
        addObject(label2, 249, 331);
        label2.setLocation(300, 319);
        
    }
}
