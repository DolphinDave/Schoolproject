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
        GreenfootImage img = new GreenfootImage( 50, 27 );
        img.setColor( new Color( 153, 255, 85 ));
        img.setFont( new Font("Comic Sans MS", Font.BOLD, 24 ));
        img.scale(100, 32);
        img.drawString("" + score, 43, 25 );
        setImage(img);
    }    
}
