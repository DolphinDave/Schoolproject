import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startscreen extends Animals
{
    private GreenfootImage click = new GreenfootImage("clickenter/clickenter.png");
    private GreenfootImage click1 = new GreenfootImage("clickenter/clickenter1.png");
    private int mx;
    private int my;
    private int k = 25;
    /**
     * Act - do whatever the startscreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Greenfoot.setSpeed(50);
        checkforclicked();
        countd();
        startmaingame();
    }    

    public void checkforclicked() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){  
            mx = mouse.getX();  
            my = mouse.getY();  
        }  
        if(mx >= 83 && mx <= 716 && my >= 143 && my <= 257) { //Greenfoot.getMouseInfo().getX() // alternativ
            setImage(click1);
        }
        else {
            setImage(click);
        }

        if (Greenfoot.mouseClicked(this)) {
            k--;
        }
        else if (Greenfoot.isKeyDown("enter")) {
            setImage(click1);
            k--;
        }
        else if (Greenfoot.isKeyDown("escape")) {
            setImage(click1);
            k--;
        }
    }

    public void countd() {
        if (k != 10 && k >= 1) {
            k--;
        }
    }

    public void startmaingame() {
        if (k == 0) {            
            k = 10;
            getWorld().removeObjects(getWorld().getObjects(Blowfish.class));
            getWorld().removeObjects(getWorld().getObjects(Jellyfish.class));
            getWorld().removeObjects(getWorld().getObjects(Shark.class));
            //Greenfoot.setWorld(new world());
            getWorld().addObject(new rockcounter(), 60, 100);
            getWorld().addObject(new rocksleft(), 70, 20);
            getWorld().addObject(new rocksleftcount(), 155, 20);
            getWorld().addObject(new score(), 670, 20);
            getWorld().addObject(new scorecounter(), 720, 20);
            getWorld().addObject(new health(), 370, 20);
            getWorld().addObject(new display(), 435, 20);
            getWorld().addObject(new Dolphin(), 400, 300);
            world dolphinworld = (world) getWorld();
            maingame++;
            dolphinworld.musicplay(); // starts the mainmusic
            getWorld().removeObject(this);
        }
    }
}    
