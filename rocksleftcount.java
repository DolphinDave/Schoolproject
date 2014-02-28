import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocksleftcount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocksleftcount extends rocksleft
{
    private GreenfootImage a0 = new GreenfootImage("rocksleft/0.png");
    private GreenfootImage a0r = new GreenfootImage("rocksleft/0r.png");
    private GreenfootImage a1 = new GreenfootImage("rocksleft/1.png");
    private GreenfootImage a1r = new GreenfootImage("rocksleft/1r.png");
    private GreenfootImage a2 = new GreenfootImage("rocksleft/2.png");
    private GreenfootImage a2r = new GreenfootImage("rocksleft/2r.png");
    private GreenfootImage a3 = new GreenfootImage("rocksleft/3.png");
    private GreenfootImage a3r = new GreenfootImage("rocksleft/3r.png");
    private GreenfootImage a4 = new GreenfootImage("rocksleft/4.png");
    private GreenfootImage a5 = new GreenfootImage("rocksleft/5.png");
    private GreenfootImage a6 = new GreenfootImage("rocksleft/6.png");
    private GreenfootImage a7 = new GreenfootImage("rocksleft/7.png");
    private GreenfootImage a8 = new GreenfootImage("rocksleft/8.png");
    private GreenfootImage a9 = new GreenfootImage("rocksleft/9.png");
    private GreenfootImage a10 = new GreenfootImage("rocksleft/10.png");
    private GreenfootImage a11 = new GreenfootImage("rocksleft/11.png");
    private GreenfootImage a12 = new GreenfootImage("rocksleft/12.png");
    private GreenfootImage a13 = new GreenfootImage("rocksleft/13.png");
    private GreenfootImage a14 = new GreenfootImage("rocksleft/14.png");
    private GreenfootImage a15 = new GreenfootImage("rocksleft/15.png");
    private GreenfootImage a16 = new GreenfootImage("rocksleft/16.png");
    private GreenfootImage a17 = new GreenfootImage("rocksleft/17.png");
    private GreenfootImage a18 = new GreenfootImage("rocksleft/18.png");
    private GreenfootImage a19 = new GreenfootImage("rocksleft/19.png");
    private GreenfootImage max = new GreenfootImage("rocksleft/max.png");
    private int timer0 = 50;
    private int timer1 = 50;
    private int timer2 = 50;
    private int timer3 = 50;
    /**
     * Act - do whatever the rocksleftcount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeimage();
    }    

    public void changeimage() {
        if (numberofrocks == 0 && timer0 >= 25) {
            setImage(a0);
            timer0--;
        }
        else if (numberofrocks == 0 && timer0 < 25 && timer0 >= 0) {
            setImage(a0r);
            timer0--;
        }
        else if (timer0 < 0) {
            timer0 = 50;
        }
        else if (numberofrocks == 1 && timer1 >= 25) {
            setImage(a1);
            timer1--;
        }
        else if (numberofrocks == 1 && timer1 < 25 && timer1 >= 0) {
            setImage(a1r);
            timer1--;
        }
        else if (timer1 < 0) {
            timer1 = 50;
        }
        else if (numberofrocks == 2 && timer2 >= 25) {
            setImage(a2);
            timer2--;
        }
        else if (numberofrocks == 2 && timer2 < 25 && timer2 >= 0) {
            setImage(a2r);
            timer2--;
        }
        else if (timer2 < 0) {
            timer2 = 50;
        }
        else if (numberofrocks == 3 && timer3 >= 25) {
            setImage(a3);
            timer3--;
        }
        else if (numberofrocks == 3 && timer3 < 25 && timer3 >= 0) {
            setImage(a3r);
            timer3--;
        }
        else if (timer3 < 0) {
            timer3 = 50;
        }    
        else if (numberofrocks == 4) {
            setImage(a4);
        }        
        else if (numberofrocks == 5) {
            setImage(a5);
        }        
        else if (numberofrocks == 6) {
            setImage(a6);
        }
        else if (numberofrocks == 7) {
            setImage(a7);
        }        
        else if (numberofrocks == 8) {
            setImage(a8);
        }
        else if (numberofrocks == 9) {
            setImage(a9);
        }
        else if (numberofrocks == 10) {
            setImage(a10);
        }
        else if (numberofrocks == 11) {
            setImage(a11);
        }
        else if (numberofrocks == 12) {
            setImage(a12);
        }
        else if (numberofrocks == 13) {
            setImage(a13);
        }
        else if (numberofrocks == 14) {
            setImage(a14);
        }
        else if (numberofrocks == 15) {
            setImage(a15);
        }
        else if (numberofrocks == 16) {
            setImage(a16);
        }
        else if (numberofrocks == 17) {
            setImage(a17);
        }
        else if (numberofrocks == 18) {
            setImage(a18);
        }
        else if (numberofrocks == 19) {
            setImage(a19);
        }
        else if (numberofrocks == 20) {
            setImage(max);
        }
        else return;

    }
}
