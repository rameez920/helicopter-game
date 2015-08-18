package com.Rameez.helicopter.Screen;

import com.Rameez.helicopter.Camera.OrthoCamera;
import com.Rameez.helicopter.Entity.EntityManager;
import com.Rameez.helicopter.Entity.Walls;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Rameez on 7/21/2015.
 */
public class GameScreen extends Screen {
    private OrthoCamera camera;
    private EntityManager entityManager;
    private Walls wall;

    private  Vector2 position;


    @Override
    public void create() {
        camera = new OrthoCamera();
        entityManager = new EntityManager();
        wall = new Walls();
        position = new Vector2(850, 0);

    }

    @Override
    public void update() {
        camera.update();
        entityManager.update();

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);

        sb.begin();
        entityManager.render(sb);
        sb.end();

        wall.render(position);


    }

    @Override
    public void resize(int width, int height) {
        camera.resize();
    }

    @Override
    public void dispose() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }
}
