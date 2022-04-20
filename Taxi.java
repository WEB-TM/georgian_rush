import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Taxi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taxi extends Actor
{
    int score = 0;
    
    public void act()
    {   getWorld().showText("Score: "+score, 70, 30);
        checkKey();
        end();
        addScore();
    }
    
    public void checkKey(){
        if(Greenfoot.isKeyDown("left")){
            if(getX() >= 155){
                setLocation(getX() - 5, getY());
            }
        }
        
        if(Greenfoot.isKeyDown("right")){
            if(getX() <= 440){
                setLocation(getX() + 5, getY());
            }
        }

        if(Greenfoot.isKeyDown("up")){
                setLocation(getX(), getY() - 4);
        }
        
        if(Greenfoot.isKeyDown("down")){
                setLocation(getX(), getY() + 4);
        }
    }
    
    public void end(){
        if(isTouching(YellowSprinter.class) || isTouching(RedBMW.class)){
            getWorld().showText("Game over \n Score: "+score, 300, 300);
            Greenfoot.stop();
            World world = getWorld(); // as a World object, members of MyWorld are inaccessible
            MyWorld myWorld = (MyWorld) world; // the world cast as a MyWorld object
            myWorld.backgroundMusic.stop(); // stopping the music
        }
    }
    
    public void addScore(){
        if(isTouching(coin.class)){
            score = score + 1;
            removeTouching(coin.class);
        }
    }
    
    
    
}
