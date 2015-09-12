package com.Rameez.helicopter.Screen;

import com.Rameez.helicopter.Entity.Helicopter;

/**
 * Created by Rameez on 9/7/2015.
 */
public class GameWorld {
    private Helicopter helicopter;

    public GameWorld(int midPointY) {
        helicopter = new Helicopter(33, midPointY - 5, 17, 12);
    }


    public void update(float delta) {
        helicopter.update(delta);
    }

    public Helicopter getHelicopter() {
        return helicopter;
    }
}
