import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ray extends Animals
{
    private GreenfootImage ray = new GreenfootImage("Ray/ray.png");
    private GreenfootImage ray1 = new GreenfootImage("Ray/ray1.png");
    private int goupdown = 100;
    private int steady = 0;
    /**
     * Act - do whatever the Ray wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movearound();
    }    

    public void movearound() {
        int up = Greenfoot.getRandomNumber(50);
        setLocation(getX() - 1, getY()); // just as fast as flow is
        if (goupdown >= 35) {
            setLocation(getX(), getY() + 1);
            goupdown--;
            setImage(ray);
        }
        else if (goupdown < 35 && goupdown >= 0 && up <= 5 && steady == 0) {
            goupdown--;
            steady++;
            setImage(ray1);
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
