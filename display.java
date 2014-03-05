import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class display extends health
{
    private GreenfootImage health0 = new GreenfootImage("health/0.png");
    private GreenfootImage health1 = new GreenfootImage("health/1.png");
    private GreenfootImage healthp1 = new GreenfootImage("health/1p.png");
    private GreenfootImage health2 = new GreenfootImage("health/2.png");
    private GreenfootImage health3 = new GreenfootImage("health/3.png");
    private GreenfootImage health4 = new GreenfootImage("health/4.png");
    private GreenfootImage health5 = new GreenfootImage("health/5.png");
    private GreenfootImage health6 = new GreenfootImage("health/6.png");
    private GreenfootImage health7 = new GreenfootImage("health/7.png");
    private GreenfootImage health8 = new GreenfootImage("health/8.png");
    private GreenfootImage health9 = new GreenfootImage("health/9.png");
    private GreenfootImage health10 = new GreenfootImage("health/10.png");
    private GreenfootImage max = new GreenfootImage("health/max.png");
    private int pulse = 50;
    private int pulsem = 50;
    /**
     * Act - do whatever the display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changedisplay();
    }  

    public void changedisplay() {
        if (health > 10 && pulsem > 0) {
            setImage(max);
            pulsem--;
            health = 10;
        }
        else if (pulsem != 50 && pulsem > 0) {
            pulsem--;
        }
        else if (pulsem <= 0) {
            pulsem = 50;
        }
        else if (health == 10) 
            setImage(health10);
        else if (health == 9)
            setImage(health9);
        else if (health == 8)
            setImage(health8);
        else if (health == 7)
            setImage(health7);
        else if (health == 6)
            setImage(health6);
        else if (health == 5)
            setImage(health5);
        else if (health == 4)
            setImage(health4);
        else if (health == 3)
            setImage(health3);
        else if (health == 2)
            setImage(health2);
        else if (health == 1 && pulse <= 50 && pulse > 25) {
            setImage(health1);
            pulse--;
        }
        else if (health == 1 && pulse <= 25 && pulse > 0) {
            setImage(healthp1);
            pulse--;
        }
        else if (pulse <= 0) {
            pulse = 50;
        }
        else if (health == 0){
            setImage(health0);
        }
    }
}
