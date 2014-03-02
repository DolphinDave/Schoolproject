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
    public static int direction = 0; // for a ball or semthing else, 0 = right, 1 = 45 ... in ball check for number, then setLocation(getX() + ..., getY() - ...);
    public static int rockcounter = 1; // only experimental to 2
    private int waitcounter = 50;
    private int imagecounter = 30;
    public static int number;  // says how many shoots are fired
    public static int numberofrocks = 10;
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
        randomShark(); // produces some random shark
        removeDS(); // removes Dolphin at contact with shark
    }

    public void movement() {
        if (getX() > 42) {
            setLocation(getX() - 1, getY());
        }
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

    public void randomShark() {
        int t = Greenfoot.getRandomNumber(500);
        int height = Greenfoot.getRandomNumber(600);
        int Height;
        if (height >= 50 && height <= getWorld().getHeight() - 45) {
            Height = height;
        }
        else return;

        if (t == 2 && getWorld().numberOfObjects() <= 10 ) {
            getWorld().addObject(new Shark(), 780, Height);
        }
        else return;
    }

    public void removeDS() {

        if(canSee(Shark.class) && (getWorld().getObjects(Shark.class).size() != 0)) {  // checks if the two actors are touching and checks if ther are any Sharks in the World
            health--;
            getWorld().removeObject(this);
            Greenfoot.stop(); // just for now
        }
    }
}
