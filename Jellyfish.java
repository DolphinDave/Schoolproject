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
}
