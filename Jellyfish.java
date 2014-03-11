import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jellyfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jellyfish extends Animals
{
    private GreenfootImage jellyfish = new GreenfootImage("Jellyfish/Jellyfish.png");
    private GreenfootImage jellyfish1 = new GreenfootImage("Jellyfish/Jellyfish1.png");
    private int goupdown = 100;
    private int steady = 0;
    /**
     * Act - do whatever the Jellyfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        removeJR();
    }    

    public void movement() {
        int up = Greenfoot.getRandomNumber(50);
        setLocation(getX() - 1, getY()); // just as fast as flow is
        if (goupdown >= 35) {
            setLocation(getX(), getY() + 1);
            goupdown--;
            setImage(jellyfish);
        }
        else if (goupdown < 35 && goupdown >= 0 && up <= 5 && steady == 0) {
            goupdown--;
            steady++;
            setImage(jellyfish1);
        }
        else if (steady == 1 && goupdown >= 0) {
            setLocation(getX(), getY() - 2);
            goupdown--;
        }
        else if (steady == 1 && goupdown < 0) {
            steady = 0;
            goupdown = 100;
        }
        else if (goupdown < 0 && steady == 0) {
            goupdown = 100;
        }
    }

    public boolean isrockInRange1() {
        return !getObjectsInRange(25, rock.class).isEmpty();  // checks for rocks in a radius of 25px. Helps to deal with the big shark image
    }

    public boolean isrockInRange2() {
        return !getObjectsInRange(25, rock2.class).isEmpty();  // return only if the list isn't empty
    }

    public boolean isrockInRange3() {
        return !getObjectsInRange(25, rock3.class).isEmpty();  
    }

    public void removeJR() {
        int height = Greenfoot.getRandomNumber(600);
        if (isrockInRange1() && (getWorld().getObjects(rock.class).size() != 0)) {
            score++;
            getWorld().removeObjects(getWorld().getObjects(rock.class));
            getWorld().removeObject(this);
        }
        else if (isrockInRange1() && (getWorld().getObjects(rock2.class).size() != 0)) {
            score++;
            getWorld().removeObjects(getWorld().getObjects(rock2.class));
            getWorld().removeObject(this);
        }
        else if (isrockInRange1() && (getWorld().getObjects(rock3.class).size() != 0)) {
            score++;
            getWorld().removeObjects(getWorld().getObjects(rock3.class));
            getWorld().removeObject(this);
        }
        else if (getX() <= 10 && maingame >= 1) {
            getWorld().removeObject(this);
        }
        else if (getX() <= 10 && maingame == 0) {
            setLocation(790, height);
        }
        else return;
    }
}
