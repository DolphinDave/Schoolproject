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
    private int pulse = 40;
    /**
     * Act - do whatever the display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changedisplay();
    }  

    public void changedisplay() {
        if (health == 3) 
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
