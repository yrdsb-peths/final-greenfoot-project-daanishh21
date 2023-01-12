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
        
        if (Greenfoot.isKeyDown("space"))
        {
            shoot();
        }

    }
    
    private void shoot()
    {
        Blaster blaster = new Blaster();
        getWorld().addObject(blaster, getX(), getY());
    }
    
    public Rocket()
    {
        GreenfootImage image = getImage();  
        image.scale(image.getWidth() - 150, image.getHeight() - 150);
        setImage(image);
    }
    
    
    // eat the apple and spawns a  new apple 
    
    
    public void moveTheRocket()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 8,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 8,getY());
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY() - 8);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY() + 8);
        }
        
        // added movement controls for "wasd" keys along with arrow keys
        
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 8,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 8,getY());
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY() - 8);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY() + 8);
        }

    }
    
    
}