import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rock extends Dolphin
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
        if (number == 1) {
            if (direction == 1 && rockcounter == 0) {
                setRotation(-45);
                rockcounter--;
            }
            else if (direction == 2 && rockcounter == 0) {
                setRotation(-90);
                rockcounter--;
            }
            else if (direction == 3 && rockcounter == 0) {
                setRotation(-135);
                rockcounter--;
            }
            else if (direction == 4 && rockcounter == 0) {
                setRotation(-180);
                rockcounter--;
            }
            else if (direction == 5 && rockcounter == 0) {
                setRotation(-215);
                rockcounter--;
            }
            else if (direction == 6 && rockcounter == 0) {
                setRotation(-270);
                rockcounter--;
            }
            else if (direction == 7 && rockcounter == 0) {
                setRotation(-315);
                rockcounter--;
            }
            else if (direction == 0 && rockcounter == 0) {
                setRotation(0);
                rockcounter--;
            }         
        }
        if (number == 2 || number == 3) {
            if (direction == 1 && rockcounter == 0) {
                setRotation(-35);
                rockcounter--;
            }
            else if (direction == 2 && rockcounter == 0) {
                setRotation(-80);
                rockcounter--;
            }
            else if (direction == 3 && rockcounter == 0) {
                setRotation(-125);
                rockcounter--;
            }
            else if (direction == 4 && rockcounter == 0) {
                setRotation(-170);
                rockcounter--;
            }
            else if (direction == 5 && rockcounter == 0) {
                setRotation(-215);
                rockcounter--;
            }
            else if (direction == 6 && rockcounter == 0) {
                setRotation(-260);
                rockcounter--;
            }
            else if (direction == 7 && rockcounter == 0) {
                setRotation(-305);
                rockcounter--;
            }
            else if (direction == 0 && rockcounter == 0) {
                setRotation(10);
                rockcounter--;
            }   
        }
    }

    public void destroy() {
        touchesedge();
    }

    public void touchesedge() {
        if (getX() <= 10 ||  getY() <= 10) {
            rockcounter = 3;
            getWorld().removeObject(this);

        }
        else if (getX() >= getWorld().getWidth() -10 || getY() >= getWorld().getHeight() -10) {
            rockcounter = 3;
            getWorld().removeObject(this);

        }
    }
}
