package com.Rameez.helicopter.Entity;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Rameez on 8/23/2015.
 */
public class Scrollable {
    protected Vector2 position, velocity;
    protected int width, height;
    protected boolean isScrolledLeft;

    public Scrollable(float x, float y, int height, int width, float scrollSpeed) {
        this.height = height;
        this.width = width;
    }

    public void update(float delta) {
        position.add(velocity.cpy().scl(delta));

       //if object is no longer visible on screen
        if  (position.x + width < 0)
            isScrolledLeft = true;
    }

    public void reset(float newX) {
        position.x = newX;
        isScrolledLeft = false;
    }

    public boolean isScrolledLeft() {
        return isScrolledLeft;
    }

    public float getTailX() {
        return position.x +  width;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
