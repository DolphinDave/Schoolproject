import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stone extends Animals
{
    private int turnme = 0;
    /**
     * Act - do whatever the Stone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        flow();
        turnrandom();
        delete();
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

    public void delete() {
        if (canSee(rock.class)) {
            getWorld().removeObject(this);
            numberofrocks++;
        }
        else if (canSee(rock2.class)) {
            getWorld().removeObject(this);
            numberofrocks++;
        }
        else if (canSee(rock3.class)) {
            getWorld().removeObject(this);
            numberofrocks++;
        }
        else if (canSee(Dolphin.class)) {
            getWorld().removeObject(this);
            numberofrocks++;
        }
        else if (getX() <= 10) {
            getWorld().removeObject(this);
        }
    }
}
