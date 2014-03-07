import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Animals
{
    private GreenfootImage dolphin = new GreenfootImage("dolphin/dolphin.png");
    private GreenfootImage dolphin1 = new GreenfootImage("dolphin/dolphin1.png");
    private GreenfootImage dolphin45 = new GreenfootImage("dolphin/dolphin45.png");
    private GreenfootImage dolphin451 = new GreenfootImage("dolphin/dolphin451.png");
    private GreenfootImage dolphin90 = new GreenfootImage("dolphin/dolphin90.png");
    private GreenfootImage dolphin901 = new GreenfootImage("dolphin/dolphin901.png");
    private GreenfootImage dolphin135 = new GreenfootImage("dolphin/dolphin135.png");
    private GreenfootImage dolphin1351 = new GreenfootImage("dolphin/dolphin1351.png");
    private GreenfootImage dolphin180 = new GreenfootImage("dolphin/dolphin180.png");
    private GreenfootImage dolphin1801 = new GreenfootImage("dolphin/dolphin1801.png");
    private GreenfootImage dolphin225 = new GreenfootImage("dolphin/dolphin225.png");
    private GreenfootImage dolphin2251 = new GreenfootImage("dolphin/dolphin2251.png");
    private GreenfootImage dolphin270 = new GreenfootImage("dolphin/dolphin270.png");
    private GreenfootImage dolphin2701 = new GreenfootImage("dolphin/dolphin2701.png");
    private GreenfootImage dolphin315 = new GreenfootImage("dolphin/dolphin315.png");
    private GreenfootImage dolphin3151 = new GreenfootImage("dolphin/dolphin3151.png");
    private GreenfootImage dolphint = new GreenfootImage("dolphint/dolphint.png");
    private GreenfootImage dolphin1t = new GreenfootImage("dolphint/dolphin1t.png");
    private GreenfootImage dolphin45t = new GreenfootImage("dolphint/dolphin45t.png");
    private GreenfootImage dolphin451t = new GreenfootImage("dolphint/dolphin451t.png");
    private GreenfootImage dolphin90t = new GreenfootImage("dolphint/dolphin90t.png");
    private GreenfootImage dolphin901t = new GreenfootImage("dolphint/dolphin901t.png");
    private GreenfootImage dolphin135t = new GreenfootImage("dolphint/dolphin135t.png");
    private GreenfootImage dolphin1351t = new GreenfootImage("dolphint/dolphin1351t.png");
    private GreenfootImage dolphin180t = new GreenfootImage("dolphint/dolphin180t.png");
    private GreenfootImage dolphin1801t = new GreenfootImage("dolphint/dolphin1801t.png");
    private GreenfootImage dolphin225t = new GreenfootImage("dolphint/dolphin225t.png");
    private GreenfootImage dolphin2251t = new GreenfootImage("dolphint/dolphin2251t.png");
    private GreenfootImage dolphin270t = new GreenfootImage("dolphint/dolphin270t.png");
    private GreenfootImage dolphin2701t = new GreenfootImage("dolphint/dolphin2701t.png");
    private GreenfootImage dolphin315t = new GreenfootImage("dolphint/dolphin315t.png");
    private GreenfootImage dolphin3151t = new GreenfootImage("dolphint/dolphin3151t.png");
    public static int direction = 0; // for a ball or semthing else, 0 = right, 1 = 45 ... in ball check for number, then setLocation(getX() + ..., getY() - ...);
    public static int rockcounter = 1;
    private int waitcounter = 50;
    private int imagecounter = 30;
    public static int number;  // says how many shoots are fired
    private int getxjelly;
    private int getyjelly;
    private int slowdown = 0;
    private int slowdownmove = 0;

    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Greenfoot.setSpeed(50);
        atWorldEdge();
        movement();
        changerockcounter();
        shoot();
        randomEnemy(); // creates some random Enemys
        removeD(); // removes Dolphin at contact with something
        blowfishtouch();
    }

    public void movement() {
        if (getX() > 42) {
            setLocation(getX() - 1, getY()); // necessary for the flow
        }
        if (toxic == 0 && slowdownmove == 0) {
            if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right")) {
                imagecounter--;
                setLocation(getX() + 2, getY() - 2);
                //setImage(dolphin45);
                direction = 1;
                if (imagecounter >= 15) {
                    setImage(dolphin451);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin45);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left")) {
                imagecounter--;
                setLocation(getX() - 2, getY() - 2);
                //setImage(dolphin135);
                direction = 3;
                if (imagecounter >= 15) {
                    setImage(dolphin1351);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin135);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left")) {
                imagecounter--;
                setLocation(getX() - 2, getY() + 2);
                //setImage(dolphin225);
                direction = 5;
                if (imagecounter >= 15) {
                    setImage(dolphin2251);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin225);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right")) {
                imagecounter--;
                setLocation(getX() + 2, getY() + 2);
                //setImage(dolphin315);
                direction = 7;
                if (imagecounter >= 15) {
                    setImage(dolphin3151);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin315);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }

            else if (Greenfoot.isKeyDown("up")) {
                imagecounter--;
                setLocation(getX(), getY() - 3);
                //setImage(dolphin90);
                direction = 2;
                if (imagecounter >= 15) {
                    setImage(dolphin901);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin90);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if (Greenfoot.isKeyDown("down")) {
                imagecounter--;
                setLocation(getX(), getY() + 3);
                //setImage(dolphin270);
                direction = 6;
                if (imagecounter >= 15) {
                    setImage(dolphin2701);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin270);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if (Greenfoot.isKeyDown("right")) {
                imagecounter--;
                setLocation(getX() + 3, getY());
                //setImage(dolphin);
                direction = 0;
                if (imagecounter >= 15) {
                    setImage(dolphin1);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if (Greenfoot.isKeyDown("left")) {
                imagecounter--;
                setLocation(getX() - 3, getY());
                //setImage(dolphin180);
                direction = 4;
                if (imagecounter >= 15) {
                    setImage(dolphin1801);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin180);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else {

            }
        }

        if (toxic == 1 && slowdownmove == 0) {
            if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right")) {
                imagecounter--;
                setLocation(getX() + 2, getY() - 2);
                //setImage(dolphin45);
                direction = 1;
                if (imagecounter >= 15) {
                    setImage(dolphin451t);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin45t);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left")) {
                imagecounter--;
                setLocation(getX() - 2, getY() - 2);
                //setImage(dolphin135);
                direction = 3;
                if (imagecounter >= 15) {
                    setImage(dolphin1351t);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin135t);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left")) {
                imagecounter--;
                setLocation(getX() - 2, getY() + 2);
                //setImage(dolphin225);
                direction = 5;
                if (imagecounter >= 15) {
                    setImage(dolphin2251t);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin225t);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right")) {
                imagecounter--;
                setLocation(getX() + 2, getY() + 2);
                //setImage(dolphin315);
                direction = 7;
                if (imagecounter >= 15) {
                    setImage(dolphin3151t);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin315t);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }

            else if (Greenfoot.isKeyDown("up")) {
                imagecounter--;
                setLocation(getX(), getY() - 3);
                //setImage(dolphin90);
                direction = 2;
                if (imagecounter >= 15) {
                    setImage(dolphin901t);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin90t);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if (Greenfoot.isKeyDown("down")) {
                imagecounter--;
                setLocation(getX(), getY() + 3);
                //setImage(dolphin270);
                direction = 6;
                if (imagecounter >= 15) {
                    setImage(dolphin2701t);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin270t);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if (Greenfoot.isKeyDown("right")) {
                imagecounter--;
                setLocation(getX() + 3, getY());
                //setImage(dolphin);
                direction = 0;
                if (imagecounter >= 15) {
                    setImage(dolphin1t);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphint);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if (Greenfoot.isKeyDown("left")) {
                imagecounter--;
                setLocation(getX() - 3, getY());
                //setImage(dolphin180);
                direction = 4;
                if (imagecounter >= 15) {
                    setImage(dolphin1801t);
                }
                else if (imagecounter < 15 && imagecounter >= 0) {
                    setImage(dolphin180t);
                }
                else if (imagecounter <= 0) {
                    imagecounter = 30;
                }
            }
            else if (toxic >= 2) {
                getWorld().removeObject(this);
            }
        }
    }

    public void atWorldEdge() {         
        if (getX() >= getWorld().getWidth() - 100) { // right border is bigger, because of the spawn
            if (Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("up")) {
                setLocation(getX() - 1, getY() - 1);
            }
            else if (Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("down")) {
                setLocation(getX() - 1, getY() + 1);
            }
            else if (Greenfoot.isKeyDown("right")){
                setLocation(getX() - 2, getY());
            }
            else {
                setLocation(getX() - 2, getY());
            }
        }
        else if (getX() <= 40) { // left border

            if (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("up")) {
                setLocation(getX() + 2, getY() - 1);
            }
            else if (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("down")) {
                setLocation(getX() + 2, getY() + 1);
            }
            else if (Greenfoot.isKeyDown("left")){
                setLocation(getX() + 3, getY());
            }   
            else {
                setLocation(getX() + 3, getY());    
            }
        }
        else if (getY() <= 50) { // upper border

            if (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("up")) {
                setLocation(getX() - 1, getY() + 2);
            }
            else if (Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("up")) {
                setLocation(getX() + 1, getY() + 2);
            }
            else if (Greenfoot.isKeyDown("up")){
                setLocation(getX(), getY() + 3);
            }
            else {
                setLocation(getX(), getY() + 3);    
            }
        }

        else if (getY() >= getWorld().getHeight() - 45) { // lower border

            if (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("down")) {
                setLocation(getX() - 1, getY() - 2);
            }
            else if (Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("down")) {
                setLocation(getX() + 1, getY() - 2);
            }
            else if (Greenfoot.isKeyDown("down")){
                setLocation(getX(), getY() - 3);
            }
            else {
                setLocation(getX(), getY() -3); 
            }
        }

    }

    public void shoot() {
        if (Greenfoot.isKeyDown("space") && rockcounter == 1 && waitcounter == 50 && numberofrocks >= 1) { // waitcounter counts only if shoot is fired != 50
            number = 1;
            getWorld().addObject(new rock(), getX(), getY()); // when shoot is fired, waitcounter counts always down
            //rockcounter--;
            waitcounter--;
            numberofrocks = numberofrocks - 1;

        }
        else if (Greenfoot.isKeyDown("space") && rockcounter == 2 && waitcounter == 50 && numberofrocks >= 2) {
            number = 2;
            getWorld().addObject(new rock(), getX(), getY());
            getWorld().addObject(new rock2(), getX(), getY());
            //rockcounter = 0;
            waitcounter--;
            numberofrocks = numberofrocks - 2;
        }
        else if (Greenfoot.isKeyDown("space") && rockcounter == 3 && waitcounter == 50 && numberofrocks >= 3) {
            number = 3;
            getWorld().addObject(new rock(), getX(), getY());
            getWorld().addObject(new rock2(), getX(), getY());
            getWorld().addObject(new rock3(), getX(), getY());
            //rockcounter = 0;
            waitcounter--;
            numberofrocks = numberofrocks - 3;
        }
        else if ( waitcounter != 50 && waitcounter > 0) {
            waitcounter--;                           
        }
        else if ( waitcounter == 0) {
            waitcounter = 50;
        }

    }

    public void changerockcounter() {
        if (Greenfoot.isKeyDown("1")) {
            rockcounter = 1;
        }
        else if (Greenfoot.isKeyDown("2")) {
            rockcounter = 2;
        }
        else if (Greenfoot.isKeyDown("3")) {
            rockcounter = 3;
        }
    }

    public void randomEnemy() {
        int t = Greenfoot.getRandomNumber(500);
        int height = Greenfoot.getRandomNumber(600);
        int Height;
        if (height >= 50 && height <= getWorld().getHeight() - 45) {
            Height = height;
        }
        else return;

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
        else return;
    }

    public boolean isBlowfishInRange() {
        return !getObjectsInRange(30, Blowfish.class).isEmpty();  // checks for rocks in a radius of 25px. Helps to deal with the big shark image
    }

    public void removeD() {
        if (canSee(Shark.class) && (getWorld().getObjects(Shark.class).size() != 0)) {  // checks if the two actors are touching and checks if ther are any Sharks in the World
            health--;
            getWorld().removeObject(this);
            Greenfoot.stop(); // just for now
        }
        else if (canSee(Jellyfish.class) && (getWorld().getObjects(Jellyfish.class).size() != 0)) {
            Actor jelly = getOneIntersectingObject(Jellyfish.class);
            getxjelly = jelly.getX();
            getyjelly = jelly.getY();
            getWorld().addObject(new toxic(), getxjelly + 10, getyjelly - 6);
            getWorld().addObject(new toxic(), getxjelly - 8, getyjelly - 12);
            getWorld().addObject(new toxic(), getxjelly + 6, getyjelly + 6);
            toxic++;
            getWorld().removeObject(jelly); //removes only the touching actor, not all from the same class
            toxicdeath();    
        }
        else if (isBlowfishInRange() && (getWorld().getObjects(Blowfish.class).size() != 0)) {
            Actor blow = getOneIntersectingObject(Blowfish.class);
            getWorld().removeObject(blow);
            blowfishtouch++;
        }
    }

    public void toxicdeath() {
        if (toxic >= 2) {
            health--;
            getWorld().removeObject(this);
            Greenfoot.stop(); // just for now
        }
    }

    public void blowfishtouch() {
        if (blowfishtouch > 0) {
            slowdown = 200;
            blowfishtouch = 0;
        }
        if (slowdown > 0 && slowdownmove == 1) {
            slowdown--;
            slowdownmove = 0;
        }
        else if (slowdown > 0 && slowdownmove == 0) {
            slowdown--;
            slowdownmove = 1;
        }
        else if (slowdown <= 0) {
            slowdownmove = 0;
        }
    }
}
