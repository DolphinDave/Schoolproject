import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class introduction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class check extends startscreen
{
    private GreenfootImage check = new GreenfootImage("introduction/check.png");
    private GreenfootImage check1 = new GreenfootImage("introduction/check1.png");
    private GreenfootImage checkmouse = new GreenfootImage("introduction/checkmouse.png");
    private GreenfootImage checkmouse1 = new GreenfootImage("introduction/checkmouse1.png");
    private int mx;
    private int my;
    /**
     * Act - do whatever the introduction wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        addmark();
        changeimage();
    }   

    public void changeimage() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){  
            mx = mouse.getX();  
            my = mouse.getY();  
        }  
        if(introduction == 0) {
            if(mx >= 730 && mx <= 770 && my >= 523 && my <= 563) { //Greenfoot.getMouseInfo().getX() // alternativ
                setImage(checkmouse);
            }
            else {
                setImage(check);
            }
        }

        else if(introduction == 1) {
            if(mx >= 730 && mx <= 770 && my >= 523 && my <= 563) { //Greenfoot.getMouseInfo().getX() // alternativ
                setImage(checkmouse1);
            }
            else {
                setImage(check1);
            }
        }
    }

    public void addmark() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseClicked(this) && introduction == 1) {
            setImage(check);
            introduction--;
        }
        else if (Greenfoot.mouseClicked(this) && introduction == 0) {
            setImage(check1);
            introduction++;
        }
    }
}
