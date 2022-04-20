import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RedBMW extends parent
{
    int speed = -3;
    
    public void act()
    {
        RedBMW a = new RedBMW();
        Actor i = getOneIntersectingObject(YellowSprinter.class);
    
        move(speed);
        checkDouble(i);
        end();
    }
}
