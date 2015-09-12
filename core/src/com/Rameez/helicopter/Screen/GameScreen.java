package com.Rameez.helicopter.Screen;


import com.Rameez.helicopter.Entity.InputHandler;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Rameez on 7/21/2015.
 */
public class GameScreen implements com.badlogic.gdx.Screen {
    private GameWorld world;
    private GameRenderer renderer;
    private float runtime = 0;

    public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight / 2);

        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world, (int) gameHeight, midPointY);

        Gdx.input.setInputProcessor(new InputHandler(world.getHelicopter()));
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        runtime+=delta;
        world.update(delta);
        renderer.render(runtime);
    }

    @Override
    public void resize(int width, int height) {

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

    @Override
    public void hide() {

    }
}
