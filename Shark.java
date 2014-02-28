import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Animals
{
    private GreenfootImage hai = new GreenfootImage("hai/hai.png");
    private GreenfootImage hai1 = new GreenfootImage("hai/hai1.png");
    private GreenfootImage hai2 = new GreenfootImage("/hai/hai2.png");
    private int waitforturn = 20;
    private int a = Greenfoot.getRandomNumber(500);
    private int animationt = 100;
    /**
     * Act - do whatever the fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movefish();
        animation();
        deletefish();
    }        

    public void movefish() {
        setLocation(getX() - 1, getY());
        if (waitforturn <= 0) { //&& schwierigkeit 1 ... schwierigkeit 2 ... waitforturn runtersetzen, verschiebung vergrößern 
            if (a <= 50 && getY() <= 550) {
                setLocation(getX(), getY() - 2);
                waitforturn = 20;
            }
            else if (a >= 450 && getY() >= 50) {
                setLocation(getX(), getY() + 2);
                waitforturn = 20;
            }
            else if (a <= 100 && getY() >= 400) { // a higher chance to go up if shark is in the lower half
                setLocation(getX(), getY() - 2);
                waitforturn = 20;
            }
            else if (a >= 400 && getY() <= 200) { // a higher chance to go down if shark is in the upper half
                setLocation(getX(), getY() + 2);
                waitforturn = 20;
            }
        }
        else if ( getY() <= 50) {
            setLocation(getX(), getY() + 3);
        }
        else if ( getY() >= getWorld().getHeight() - 50) {
            setLocation(getX(), getY() - 3);
        }
        else {
            waitforturn--;
        }

    }

    public void animation() {
        animationt--;
        if (animationt >= 75) {
            setImage(hai);
        }
        else if (animationt < 75 && animationt >= 50) {
            setImage(hai1);
        }
        else if (animationt < 50 && animationt >= 25) {
            setImage(hai);
        }
        else if (animationt < 25 && animationt >= 0) {
            setImage(hai2);
        }
        else if (animationt <= 0) {
            animationt = 100;
        }

    }

    public void deletefish() {
        if (getX() <= 20) {
            waitforturn = 20;
            getWorld().removeObject(this);
        }
        else return;
    }
}
