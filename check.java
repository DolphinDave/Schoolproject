import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class introduction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class check extends startscreen
{
    private GreenfootImage check = new GreenfootImage("introduction/check.png");
    private GreenfootImage check1 = new GreenfootImage("introduction/check1.png");
    /**
     * Act - do whatever the introduction wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        addmark();
    }   

    public void addmark() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseClicked(this) && introduction == 1) {
            setImage(check);
            introduction--;
        }
        else if (Greenfoot.mouseClicked(this) && introduction == 0) {
            setImage(check1);
            introduction++;
        }
    }
}
