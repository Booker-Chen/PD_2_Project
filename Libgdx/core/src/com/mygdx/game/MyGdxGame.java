package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.PlayScreen.PlayScreen;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class MyGdxGame extends Game {
	public static final int V_WIDTH =400;
	public static  final int V_HEIGHT=208;
	public static final float PPM=100;

	public SpriteBatch batch;
	@Override
	public void create() {
		batch =new SpriteBatch();
		setScreen(new PlayScreen(this));
	}
	@Override
	public void render (){
		super.render();
	}
}

