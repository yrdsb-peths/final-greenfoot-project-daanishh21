import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The objectile that will be thrown down at the spaceship.
 * 
 * @author (daanish) 
 * @version (a version number or a date)
 */
public class asteroid extends Actor
{
    int speed = 10;
    
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // remove apple and draw game over when apple gets to the bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
}

