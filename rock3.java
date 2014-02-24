import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rock3 extends Dolphin
{
    private int stopmove = 1;
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
        if (direction == 1 && stopmove == 1) {
            setRotation(-45);
            stopmove--;
        }
        else if (direction == 2 && stopmove == 1) {
            setRotation(-90);
            stopmove--;
        }
        else if (direction == 3 && stopmove == 1) {
            setRotation(-135);
            stopmove--;
        }
        else if (direction == 4 && stopmove == 1) {
            setRotation(-180);
            stopmove--;
        }
        else if (direction == 5 && stopmove == 1) {
            setRotation(-215);
            stopmove--;
        }
        else if (direction == 6 && stopmove == 1) {
            setRotation(-270);
            stopmove--;
        }
        else if (direction == 7 && stopmove == 1) {
            setRotation(-315);
            stopmove--;
        }
        else if (direction == 0 && stopmove == 1) {
            setRotation(0);
            stopmove--;
        }        
    }

    public void destroy() {
        touchesedge();
    }

    public void touchesedge() {
        if (getX() <= 10 ||  getY() <= 10) {
            stopmove = 1;
            getWorld().removeObject(this);

        }
        else if (getX() >= getWorld().getWidth() -10 || getY() >= getWorld().getHeight() -10) {
            stopmove = 1;
            getWorld().removeObject(this);

        }
    }
}
