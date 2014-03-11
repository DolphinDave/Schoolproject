import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playagain extends Animals
{
    public static GreenfootSound freesound = new GreenfootSound("Sub.Sound - Feel the Buzz.mp3");
    private GreenfootImage clickagain = new GreenfootImage("clickagain/clickagain.png");
    private GreenfootImage clickagain1 = new GreenfootImage("clickagain/clickagain1.png");
    private int mx;
    private int my;
    private int k = 25;
    private int onetime = 1;
    /**
     * Act - do whatever the playagain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Greenfoot.setSpeed(50);
        removeenemys();
        freesound.playLoop();
        checkforclicked();
        startmaingame();
    }    

    public void removeenemys() {
        if (onetime == 1) {
            getWorld().removeObjects(getWorld().getObjects(Blowfish.class));
            getWorld().removeObjects(getWorld().getObjects(Jellyfish.class));
            getWorld().removeObjects(getWorld().getObjects(Shark.class));
            onetime--;
        }
    }

    public void checkforclicked() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){  
            mx = mouse.getX();  
            my = mouse.getY();  
        }  
        if(mx >= 83 && mx <= 716 && my >= 143 && my <= 257) { //Greenfoot.getMouseInfo().getX() // alternativ
            setImage(clickagain1);
        }
        else {
            setImage(clickagain);
        }

        if (Greenfoot.mouseClicked(this)) {
            k--;
        }
        else if (Greenfoot.isKeyDown("enter")) {
            setImage(clickagain1);
            k--;
        }
        else if (Greenfoot.isKeyDown("escape")) {
            setImage(clickagain1);
            k--;
        }
    }

    public void startmaingame() {
        if (k != 10 && k >= 1) {
            k--;
        }
        else if (k == 0) {            
            k = 10;
            getWorld().addObject(new rockcounter(), 60, 100);
            world dolphinworld = (world) getWorld();
            maingame++;
            freesound.stop();
            dolphinworld.musicplay(); // starts the mainmusic
            getWorld().removeObject(this);
        }
    }
}    
