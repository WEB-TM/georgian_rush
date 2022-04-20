import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class YellowSprinter extends parent
{
    int speed = 4;
    
    public void act()
    {
        YellowSprinter a = new YellowSprinter();
        Actor i = getOneIntersectingObject(YellowSprinter.class);
    
        move(speed);
        checkDouble(i);
        end();
    }
}
