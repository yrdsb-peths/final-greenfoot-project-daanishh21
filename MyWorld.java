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
    
    public int score = 0;
    Label scoreLabel;
    int level = 3;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(600, 600, 1);
        
        Rocket rocket = new Rocket();
        addObject(rocket, 300, 450);
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        createAsteroid();
        
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void createAsteroid()
    {
        asteroid asteroid = new asteroid();
        asteroid.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(asteroid, x, y);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
            
        }
    }
    
}
