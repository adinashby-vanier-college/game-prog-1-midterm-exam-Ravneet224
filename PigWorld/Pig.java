// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * 
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameWonWorld()
    {
        World Winner =  new  Winner();
        Greenfoot.setWorld(Winner);
        Greenfoot.playSound("win.wav");
    }

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * 
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
            move(3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
            move(3);
        }
        if (Greenfoot.isKeyDown("up")) {
            turn(3);
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            turn(3);
            move(3);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
    }
}
