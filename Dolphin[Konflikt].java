import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Animals
{
    private GreenfootImage dolphin = new GreenfootImage("dolphin.png");
    private GreenfootImage dolphinf = new GreenfootImage("dolphinf.png");
    private GreenfootImage dolphinlf = new GreenfootImage("dolphinlf.png");
    private GreenfootImage dolphinl = new GreenfootImage("dolphinl.png");
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
    }

    public void movement() {

        if (Greenfoot.isKeyDown("up")) {
            move(3);
            setRotation(-90);
            setImage(dolphin);
        }
        else if (Greenfoot.isKeyDown("down")) {
            move(3);
            setRotation(-270);
            setImage(dolphin);
        }
        else if (Greenfoot.isKeyDown("right")) {
            move(3);
            setRotation(0);
            setImage(dolphin);
        }
        else if (Greenfoot.isKeyDown("left")) {
            move(3);
            setRotation(-180);
            setImage(dolphinl);
        }
        if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right")) {
            setRotation(-45);
            setImage(dolphin);
        }
        if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left")) {
            setRotation(-135);
            setImage(dolphinl);
        }
        if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left")) {
            setRotation(-225);
            setImage(dolphinl);
        }
        if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right")) {
            setRotation(-315);
            setImage(dolphin);
        }
    }
}
