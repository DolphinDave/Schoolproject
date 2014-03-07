import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Animals
{
    private GreenfootImage hai = new GreenfootImage("hai/hair.png");
    private GreenfootImage hai1 = new GreenfootImage("hai/hai1r.png");
    private GreenfootImage hai2 = new GreenfootImage("/hai/hai2r.png");
    private int waitforturn = 20;
    private int animationt = 60;
    private int turn = 1;
    /**
     * Act - do whatever the Shark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movefish();
        animation();
        removeSR(); //removes Shark when touching rock
    }        

    public void movefish() {
        int a = Greenfoot.getRandomNumber(500); // needs to be here, to get every time a new random number
        if (turn == 1) {
            turn(180);
            turn--;
        }
        move(1);
        if (waitforturn <= 0) { //&& schwierigkeit 1 ... schwierigkeit 2 ... waitforturn runtersetzen, verschiebung vergrößern 
            if (a <= 2 && getY() <= 550 && getRotation() <= 190) {
                turn (35);
                waitforturn = 20;
            }
            else if (a >= 498 && getY() >= 50 && getRotation() >= 150) {
                turn (-35);
                waitforturn = 20;
            }
            else if (a <= 100 && getY() >= 400 && getRotation() <= 190) { // a higher chance to go up if shark is in the lower half
                turn (35);
                waitforturn = 20;
            }
            else if (a >= 450 && getY() <= 200 && getRotation() >= 150) { // a higher chance to go down if shark is in the upper half
                turn (-35);
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
        if (animationt >= 45) {
            setImage(hai);
        }
        else if (animationt < 45 && animationt >= 30) {
            setImage(hai1);
        }
        else if (animationt < 30 && animationt >= 15) {
            setImage(hai);
        }
        else if (animationt < 15 && animationt >= 0) {
            setImage(hai2);
        }
        else if (animationt <= 0) {
            animationt = 60;
        }
        else {
            setImage(hai);
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

    public void removeSR() {
        if (isrockInRange1() && (getWorld().getObjects(rock.class).size() != 0)) {
            score++;
            getWorld().removeObjects(getWorld().getObjects(rock.class));
            getWorld().removeObject(this);
        }
        else if (isrockInRange2() && (getWorld().getObjects(rock2.class).size() != 0)) {
            score++;
            getWorld().removeObjects(getWorld().getObjects(rock2.class));
            getWorld().removeObject(this);
        }
        else if (isrockInRange2() && (getWorld().getObjects(rock3.class).size() != 0)) {
            score++;
            getWorld().removeObjects(getWorld().getObjects(rock3.class));
            getWorld().removeObject(this);
        }
        else if (getX() <= 15) {
            waitforturn = 20;
            getWorld().removeObject(this);
        }
        else return;
    }
}
