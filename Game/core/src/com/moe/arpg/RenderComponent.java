package com.moe.arpg;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RenderComponent extends Component {
	Sprite sprite;
	
	public RenderComponent() { }
	
	public RenderComponent(Texture texture) {
		this.sprite = new Sprite(texture);
		this.sprite.setScale(0.1f);
		this.sprite.setOriginCenter();
	}
	
	public void setTexture(Texture texture) {
		this.sprite = new Sprite(texture);
	}
	
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
	
}