package com.Rameez.helicopter.Entity;

import com.Rameez.helicopter.TextureManager;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Rameez on 7/22/2015.
 */
public class Helicopter extends Entity {
    private EntityManager entityManager;
    public static float HEIGHT;


    public Helicopter(Vector2 pos) {

        super(TextureManager.HELICOPTER ,pos, new Vector2(0, -100));
        HEIGHT = this.getBounds().getHeight();

    }

    @Override
    public void update() {
        pos.add(direction);

        if (Gdx.input.isKeyPressed(Keys.SPACE)) {
            setDirection(0, 350);
        } else {
            setDirection(0, -350);
        }
    }




}

// create helicopter on screen
// implement control scheme