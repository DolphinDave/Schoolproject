import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blowfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blowfish extends Animals
{
    private GreenfootImage blowfish = new GreenfootImage("blowfish/blowfishr.png");
    private GreenfootImage blowfish1 = new GreenfootImage("blowfish/blowfish1r.png");
    private GreenfootImage blowfisha = new GreenfootImage("blowfish/blowfishar.png");
    private GreenfootImage blowfish1a = new GreenfootImage("blowfish/blowfish1ar.png");
    private int waitforturn = 20;
    private int animationt = 60;
    private int turn = 1;
    private int turnimage = 1;
    private int waitfornextblowup = 100;
    private int duration = 150;
    private int animationcounter = 30;
    /**
     * Act - do whatever the Blowfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animation();
        moveblow();
    }    

    public void moveblow() {
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
        int random = Greenfoot.getRandomNumber(100);
        animationcounter--;
        if (turnimage == 1) {
            setImage(blowfish);
            turnimage--;
        }
        else if (random == 15 && duration >= 0) {
            setImage(blowfish1);
            duration--;
        }
        else if (duration != 150 && duration >= 0) {
            if (animationcounter >= 15) {
                setImage(blowfish1);
            }
            else if (animationcounter < 15 && animationcounter >= 0) {
                setImage(blowfish1a);
            }
            else if (animationcounter <= 0) {
                animationcounter = 30;
            }
            duration--;
        }
        else if (duration < 0 && waitfornextblowup >= 0) {
            if (animationcounter >= 15) {
                setImage(blowfish);
            }
            else if (animationcounter < 15 && animationcounter >= 0) {
                setImage(blowfisha);
            }
            else if (animationcounter <= 0) {
                animationcounter = 30;
            }
            waitfornextblowup--;
        }
        else if (duration < 0 && waitfornextblowup < 0) {
            duration = 150;
            waitfornextblowup = 100;
        }

    }
}
