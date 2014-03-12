import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animals extends Actor
{
    public static int score = 0;
    public static int health = 3;
    public static int toxic = 0;
    public static int blowfishtouch = 0;
    public static int numberofrocks = 10;
    public static int untouchable = 0;
    public static int rockcounter = 1;
    public static int maingame = 0;
    public static int blink = 0;
    public static int introduction = 1;
    /**
     * Act - do whatever the Animals wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    

    /**
     * Return true if we can see an object of class 'clss' right where we are. 
     * False if there is no such object here.
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
}