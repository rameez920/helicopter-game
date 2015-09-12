package com.Rameez.helicopter.Screen;

import com.Rameez.helicopter.AssetLoader;
import com.Rameez.helicopter.Entity.Helicopter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Rameez on 9/7/2015.
 */
public class GameRenderer {
    private GameWorld myWorld;
    private OrthographicCamera camera;
    private ShapeRenderer shapeRenderer;

    private SpriteBatch spriteBatch;

    private int midPointY, gameHeight;

    public GameRenderer(GameWorld world, int gameHeight, int midPointY) {
        myWorld = world;
        camera = new OrthographicCamera();
        camera.setToOrtho(true, 136, 204);

        this.gameHeight = gameHeight;
        this.midPointY = midPointY;

        spriteBatch = new SpriteBatch();
        spriteBatch.setProjectionMatrix(camera.combined);

        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(camera.combined);


    }


    public void render(float runtime) {
        Helicopter helicopter = myWorld.getHelicopter();

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        shapeRenderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
        shapeRenderer.rect(0, 0, 136, midPointY + 66);

        // Draw Grass
        shapeRenderer.setColor(111 / 255.0f, 186 / 255.0f, 45 / 255.0f, 1);
        shapeRenderer.rect(0, midPointY + 66, 136, 11);

        // Draw Dirt
        shapeRenderer.setColor(147 / 255.0f, 80 / 255.0f, 27 / 255.0f, 1);
        shapeRenderer.rect(0, midPointY + 77, 136, 52);

        shapeRenderer.end();

        spriteBatch.begin();
        spriteBatch.disableBlending();
        spriteBatch.draw(AssetLoader.background, 0, midPointY + 23, 136, 43);

        spriteBatch.enableBlending();

        spriteBatch.draw(AssetLoader.helicopter, helicopter.getX(), helicopter.getY(),
                helicopter.getWidth(), helicopter.getHeight());

        spriteBatch.end();


    }

}
