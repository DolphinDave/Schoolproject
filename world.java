import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world extends World
{

    /**
     * Constructor for objects of class world.
     * 
     */
    public world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new rockcounter(), 60, 150);
        addObject(new Dolphin(), 400, 300);
        
    }
        public void started() { //Sets speed after pausing back to 50
        Greenfoot.setSpeed(50);
    }
}
