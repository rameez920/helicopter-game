package com.Rameez.helicopter.Entity;


import java.util.Random;

/**
 * Created by Rameez on 8/5/2015.
 */
public class Walls extends Scrollable    {

    private Random r;

    public Walls(float x, float y, int height, int width, float scrollSpeed) {
        super(x, y, height, width, scrollSpeed);

        r = new Random();
    }

    @Override
    public void reset(float newX) {
        super.reset(newX);

        height = r.nextInt(90) + 15;
    }
}
