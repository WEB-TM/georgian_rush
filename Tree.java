import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends parent
{
    int speed = 2;
    public void act()
    {
        Tree a = new Tree();
        Actor i = getOneIntersectingObject(Tree.class);
    
        move(speed);
        checkDouble(i);
        end();
    }
}
