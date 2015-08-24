package com.Rameez.helicopter.Entity;


import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Rameez on 7/22/2015.
 */
public class EntityManager {
    private  final Helicopter helicopter;


    public EntityManager() {
         helicopter = new Helicopter(new Vector2(100, 240));



    }

    public Helicopter getHelicopter() {
        return helicopter;
    }

    public void update() {
        helicopter.update();

    }
    
    public void render(SpriteBatch sb) {
        helicopter.render(sb);
    }
}
