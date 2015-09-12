package com.Rameez.helicopter;


import com.Rameez.helicopter.Screen.GameScreen;
import com.badlogic.gdx.Game;

public class MainGame extends Game {


	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new GameScreen());
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}



