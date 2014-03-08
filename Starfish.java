import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Starfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starfish extends Animals
{
    private int turnme = 0;
    /**
     * Act - do whatever the Starfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        flow();
        turnrandom();
        invincible();
    }  

    public void flow() {
        setLocation(getX() - 1, getY());
    }

    public void turnrandom() {
        int degrees = Greenfoot.getRandomNumber(359);
        if (turnme == 0) {
            turn(degrees);
            turnme--;
        }
    }

    public void invincible() {
        if (canSee(rock.class)) {
            getWorld().removeObject(this);
            untouchable = 500;
        }
        else if (canSee(rock2.class)) {
            getWorld().removeObject(this);
            untouchable = 500;
        }
        else if (canSee(rock3.class)) {
            getWorld().removeObject(this);
            untouchable = 500;
        }
        else if (canSee(Dolphin.class)) {
            getWorld().removeObject(this);
            untouchable = 500;
        }
        else if (getX() <= 10) {
            getWorld().removeObject(this);
        }
    }
}
