import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world extends World
{
    public static GreenfootSound start = new GreenfootSound("start.wav");

    /**
     * Constructor for objects of class world.
     * 
     */
    public world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public void started() { //Sets speed after pausing back to 50
        Greenfoot.setSpeed(50);
        //if (getObjects(Dolphin.class).size() != 0) {
        //    start.playLoop();
        //}
    }

    public void stopped()  
    {  
        start.pause();
    }

    private void prepare()
    {
        addObject(new Blowfish(), 780, 300);
        addObject(new Jellyfish(), 760, 500);
        addObject(new Shark(), 740, 100);
        addObject(new startscreen(), 400, 200);
    }

    public void musicstop() {
        start.stop();
    }

    public void musicplay() {
        start.playLoop();
    }

}
