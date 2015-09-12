package com.Rameez.helicopter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Rameez on 7/22/2015.
 */
public class AssetLoader {
  public static Texture texture;
  public static TextureRegion background, wall, grass;
  public static Texture helicopter;



   public static void load() {
       texture = new Texture(Gdx.files.internal("texture.png"));
       texture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

       background = new TextureRegion(texture, 0, 0, 136, 43);
       background.flip(false, true);

       grass = new TextureRegion(texture, 0, 43, 143, 11);
       grass.flip(false, true);

       wall = new TextureRegion(texture, 136, 16, 22, 3);
       wall.flip(false, true);

       helicopter = new Texture(Gdx.files.internal("player.png"));
   }

   public static void dispose() {
       texture.dispose();
   }

}
