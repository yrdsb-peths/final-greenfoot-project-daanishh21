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
        setImage(myGif.getCurrentImage() );
        moveTheRocket();
    }
    
    public Rocket()
    {
        GreenfootImage image = getImage();  
        System.out.println("Width: "+image.getWidth()+"\nHeight: "+image.getHeight());
        image.scale(image.getWidth() - 150, image.getHeight() - 150);
        setImage(image);
    }
    
    
    
    public void moveTheRocket()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 6,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 6,getY());
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY() - 6);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY() + 6);
        }
        
        // added movement controls for "wasd" keys along with arrow keys
        
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 6,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 6,getY());
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY() - 6);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY() + 6);
        }
        
    }
    
}
