import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toxic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toxic extends Dolphin
{
    private int countanddelete = 70;
    /**
     * Act - do whatever the toxic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        deletetoxic();
    }    
    
    public void deletetoxic() {
    if (countanddelete >= 0) {
    countanddelete--;
    }
    else if (countanddelete < 0) {
    getWorld().removeObject(this);
    }
    }
}
