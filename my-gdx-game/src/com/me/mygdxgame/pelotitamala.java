package com.me.mygdxgame;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class pelotitamala extends Image{
	public pelotitamala(int x, int y) {
		super(new Texture("data/pelotitamala.png"));
		addListener(new MiInputmala(this));
		this.setX(x);
		this.setY(y);
	}
	public void act(float delta)
	{		setX(getX()+1);
		if(getX()>800)
		{
			setX(0);
			}
		if(getY()>250)
		{
		setY(0);}

	
}
}
