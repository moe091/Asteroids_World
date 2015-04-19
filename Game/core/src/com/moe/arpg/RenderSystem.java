package com.moe.arpg;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

public class RenderSystem extends EntitySystem {
SpriteBatch batch;
Array<Entity> ents = new Array<Entity>();


	public RenderSystem(SpriteBatch batch) {
		this.batch = batch;
	}
	
	public void addEntity(Entity e) {
		ents.add(e);
	}
	
	public void update(float delta) {
		int i = 0;
		for (Entity e : ents) {
			i++;
			Mappers.rm.get(e).sprite.draw(batch);
		}
		
	}
	
	
}
