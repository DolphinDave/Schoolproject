import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startscreen extends Animals
{
    /**
     * Act - do whatever the startscreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    public void randomEnemy() {
        int t = Greenfoot.getRandomNumber(500);
        int height = Greenfoot.getRandomNumber(600);
        int Height;
        if (height >= 50 && height <= getWorld().getHeight() - 45) {
            Height = height;
        }
        else return;
        //if schwierigkeit = ... && enboss != 1
        if (t == 1 && getWorld().numberOfObjects() <= 10 ) {
            getWorld().addObject(new Shark(), 780, Height);
        }
        else if (t == 2 && getWorld().numberOfObjects() <= 10) {
            getWorld().addObject(new Jellyfish(), 790, Height);
        }
        else if (t == 3 && getWorld().numberOfObjects() <= 10) {
            getWorld().addObject(new Blowfish(), 790, Height);
        }
        else if (t == 4 && getWorld().numberOfObjects() <= 10) {
            getWorld().addObject(new Stone(), 790, Height);
        }
        else if (t == 5 && getWorld().numberOfObjects() <= 10) {
            getWorld().addObject(new Stone(), 790, Height);
        }
        else if (t == 6 && getWorld().numberOfObjects() <= 10) {
            getWorld().addObject(new Starfish(), 790, Height);
        }
        else return;
    }
}
