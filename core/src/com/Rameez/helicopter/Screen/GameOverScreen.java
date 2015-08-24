package com.Rameez.helicopter.Screen;

import com.Rameez.helicopter.Camera.OrthoCamera;
import com.Rameez.helicopter.MainGame;
import com.Rameez.helicopter.TextureManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Rameez on 8/19/2015.
 */
public class GameOverScreen extends Screen {
    private OrthoCamera camera;
    private Texture texture;

    public GameOverScreen() {
        texture = TextureManager.GAME_OVER;
    }

    @Override
    public void create() {
        camera = new OrthoCamera();
        camera.resize();

    }

    @Override
    public void update() {
        camera.update();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();
        sb.draw(texture, MainGame.WIDTH / 2 - texture.getWidth() / 2, MainGame.HEIGHT / 2 - texture.getHeight() / 2);
        sb.end();
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
