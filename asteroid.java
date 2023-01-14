import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The objectile that will be thrown down at the spaceship.
 * 
 * @author (daanish) 
 * @version (January 2023)
 */
public class asteroid extends Actor
{
    int speed = 7;
    
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // remove asteroid and draw game over when it gets to the bottom
        MyWorld world = (MyWorld) getWorld();
        
        // vice versa with asteroid touching.
        if(isTouching(Rocket.class))
        {
            world.gameOver();
            world.removeObject(this);
        }
        
        GreenfootImage image = getImage();  
        image.scale(60, 60);
        setImage(image);
    }
    
    // created a speed limit for the asteroid so it doesn't plummet down.
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
}

