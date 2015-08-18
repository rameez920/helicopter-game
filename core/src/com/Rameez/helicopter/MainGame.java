package com.Rameez.helicopter;

import com.Rameez.helicopter.Screen.GameScreen;
import com.Rameez.helicopter.Screen.ScreenManager;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;


	/*


	TODO: hit detection and possibly keep score.


	*/

	public static int WIDTH = 800, HEIGHT = 480;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		ScreenManager.setCurrentScreen(new GameScreen());
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().update();

		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().render(batch);

	}

	@Override
	public void resize(int width, int height) {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().resize(width, height);

		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().update();

		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().render(batch);
	}

	@Override
	public void pause() {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().pause();
	}

	@Override
	public void resume() {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().resume();
	}
}
