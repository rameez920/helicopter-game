package com.Rameez.helicopter.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.Rameez.helicopter.MainGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Helicopter";
		config.width = 272;
		config.height = 408;
		new LwjglApplication(new MainGame(), config);
	}
}
