package com.Rameez.helicopter.Entity;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;


/**
 * Created by Rameez on 8/5/2015.
 */
public class Walls    {
    ShapeRenderer botWall, topWall;
    Vector2 position;
    Random random;
    float height, width = 40;
    private final float SPEED = -3;

    public Walls() {
        botWall = new ShapeRenderer();
        topWall = new ShapeRenderer();
        random = new Random();
        height = generateHeight();
    }

    public void render(Vector2 pos) {
        this.position = pos;

        generateTopWall();


        oppositeWall();
    }

    //create random height
    private float generateHeight() {
        return random.nextFloat() * (350 - 100) + 100;

    }

    public float getHeight() {
        return height;
    }

    public float generateTopHeight() {
        float topHeight = 450 - getHeight() - Helicopter.HEIGHT;

        return -topHeight;
    }

    public void generateTopWall() {
        botWall.begin(ShapeRenderer.ShapeType.Filled);
        botWall.setColor(Color.CYAN);
        botWall.rect(position.x, position.y, width, height);
        botWall.translate(SPEED, 0, 0);
        botWall.end();
    }


    public void oppositeWall() {
        //float height = 480 - getHeight() - Helicopter.
        topWall.begin(ShapeRenderer.ShapeType.Filled);
        topWall.setColor(Color.CYAN);
        topWall.rect(position.x, 480, width, generateTopHeight());
        topWall.translate(SPEED, 0, 0);
        topWall.end();

    }

    private Rectangle getLowerBounds() {
        return new Rectangle(position.x, position.y ,width, height);
    }

    public boolean checkCollisions(Helicopter helicopter) {
        //return if (helicopter.getBounds().overlaps(topWall))
        return false;
    }


}
