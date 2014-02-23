import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rock2 extends Dolphin
{
    /**
     * Act - do whatever the rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        directionr();
        move(6);
        destroy();
    }    

    public void directionr() {
        if (direction == 1 && rockcounter == -1) {
            setRotation(-45 - 10);
            rockcounter--;
        }
        else if (direction == 2 && rockcounter == -1) {
            setRotation(-90 - 10);
            rockcounter--;
        }
        else if (direction == 3 && rockcounter == -1) {
            setRotation(-135 - 10);
            rockcounter--;
        }
        else if (direction == 4 && rockcounter == -1) {
            setRotation(-180 - 10);
            rockcounter--;
        }
        else if (direction == 5 && rockcounter == -1) {
            setRotation(-215 - 10);
            rockcounter--;
        }
        else if (direction == 6 && rockcounter == -1) {
            setRotation(-270 - 10);
            rockcounter--;
        }
        else if (direction == 7 && rockcounter == -1) {
            setRotation(-315 - 10);
            rockcounter--;
        }
        else if (direction == 0 && rockcounter == -1) {
            setRotation(0 - 10);
            rockcounter--;
        }        
    }

    public void destroy() {
        touchesedge();
    }

    public void touchesedge() {
        if (getX() <= 10 ||  getY() <= 10) {
            //rockcounter = 1;
            getWorld().removeObject(this);

        }
        else if (getX() >= getWorld().getWidth() -10 || getY() >= getWorld().getHeight() -10) {
            //rockcounter = 1;
            getWorld().removeObject(this);

        }
    }
}
