import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rockcounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rockcounter extends Dolphin
{
    private GreenfootImage rockimage1 = new GreenfootImage("rock/rockimage1.png");
    private GreenfootImage rockimage2 = new GreenfootImage("rock/rockimage2.png");
    private GreenfootImage rockimage3 = new GreenfootImage("rock/rockimage3.png");
    /**
     * Act - do whatever the rockcounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(rockcounter == 1) {
        setImage(rockimage1);
        }
        else if (rockcounter == 2) {
        setImage(rockimage2);
        }
        else if (rockcounter == 3) {
        setImage (rockimage3);
        }
    }    
}
