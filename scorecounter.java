import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class scorecounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scorecounter extends score
{
    /**
     * Act - do whatever the scorecounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        paint();
    }    

    public void paint() {
        if (score <= 10000) {
            GreenfootImage img = new GreenfootImage( 50, 27 );
            img.setColor( new Color( 153, 255, 85 ));
            img.setFont( new Font("Comic Sans MS", Font.BOLD, 24 ));
            img.scale(110, 32);
            img.drawString("" + score, 47, 25 );
            setImage(img);
        }
        else if (score > 10000) {
            GreenfootImage img = new GreenfootImage( 50, 27 );
            img.setColor( new Color( 153, 255, 85 ));
            img.setFont( new Font("Comic Sans MS", Font.BOLD, 24 ));
            img.scale(110, 32);
            img.drawString("Max.", 47, 25 );
            setImage(img);
            score = 10000;
        }
    }
}
