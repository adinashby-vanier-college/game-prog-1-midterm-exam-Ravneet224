// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new Burger();
        addObject(burger, 179, 66);
        removeObject(burger);
        Burger burger1 =  new Burger();
        addObject(burger, 88, 87);
        Burger burger2 =  new Burger();
        addObject(burger2, 498, 202);
        Burger burger3 =  new Burger();
        addObject(burger3, 116, 327);
        Burger burger4 =  new Burger();
        addObject(burger4, 336, 111);
        Burger burger5 =  new Burger();
        addObject(burger5, 332, 342);
        Pig pig =  new Pig();
        addObject(pig, 265, 202);
        Snake snake =  new Snake();
        addObject(snake, 32, 371);
    }
}
