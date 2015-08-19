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
    float height, width = 40, topHeight;
    private final float SPEED = -3;

    public Walls() {
        position = new Vector2(850, 0);
        botWall = new ShapeRenderer();
        topWall = new ShapeRenderer();
        random = new Random();
        height = generateHeight();
        topHeight = generateTopHeight();
    }

    public void render() {


        generateBotWall();
        generateTopWall();
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

    public void generateBotWall() {
        botWall.begin(ShapeRenderer.ShapeType.Filled);
        botWall.setColor(Color.CYAN);
        botWall.rect(position.x, position.y, width, height);
        botWall.translate(SPEED, 0, 0);
        botWall.end();
    }


    public void generateTopWall() {
        //float height = 480 - getHeight() - Helicopter.
        topWall.begin(ShapeRenderer.ShapeType.Filled);
        topWall.setColor(Color.CYAN);
        topWall.rect(position.x, 480, width, topHeight);
        topWall.translate(SPEED, 0, 0);
        topWall.end();

    }


    private Rectangle getLowerBounds() {
         return new Rectangle(position.x, position.y, width ,height);
    }

    private Rectangle getUpperBounds() {
        return new Rectangle(position.x, 480, width, topHeight);
    }

    public boolean checkCollisions(Helicopter helicopter) {
         if (helicopter.getBounds().overlaps(getLowerBounds()))
             return true;
         else return helicopter.getBounds().overlaps(getUpperBounds());

    }


}
