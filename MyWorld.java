import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    GreenfootSound backgroundMusic = new GreenfootSound("chkheidze.wav");
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Taxi taxi = new Taxi();
        addObject(taxi,299,533);
        loader loader = new loader();
        addObject(loader,295,298);
        loader.setLocation(300,300);
    }



    public void act(){
        //stop playing the sound;
        backgroundMusic.playLoop();//plays the sound over and over again;
        
        if(Greenfoot.getRandomNumber(200) < 2){
            addObject(new YellowSprinter(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
        
        if(Greenfoot.getRandomNumber(500) < 1){
            addObject(new RedBMW(), Greenfoot.getRandomNumber(200) + 200, 600);
        }
        
        if(Greenfoot.getRandomNumber(10) < 2){
            addObject(new Tree(), Greenfoot.getRandomNumber(10) + 40, 0);
            addObject(new Tree(), Greenfoot.getRandomNumber(10) + 540, 0);
        }

        if(Greenfoot.getRandomNumber(200) < 3){
            addObject(new coin(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
    }
}
