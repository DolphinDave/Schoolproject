import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class invin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class invin3 extends Dolphin
{
    private GreenfootImage invin = new GreenfootImage("invin/invin.png");
    private GreenfootImage empty = new GreenfootImage("invin/empty.png");
    /**
     * Act - do whatever the invin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        follow();
        blinkparticle();
    }   
    
    public void follow() {
    int xdolphin = ((Dolphin) getWorld().getObjects(Dolphin.class).get(0)).getX();
    int ydolphin = ((Dolphin) getWorld().getObjects(Dolphin.class).get(0)).getY();
    
    setLocation(xdolphin + 20 ,ydolphin + 8);
    
    }

    public void blinkparticle() {
        if (untouchable > 0) {
            if (blink > 15 && blink <= 30) {
                setImage(invin);
            }
            else if (blink >= 0 && blink <= 15) {
                setImage(empty);
            }
        }

        else if (untouchable == 0) {
            getWorld().removeObject(this);
        }
    }
}
