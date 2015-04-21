package com.moe.arpg;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.moe.components.ControllerComponent;
import com.moe.components.StatsComponent;

public class Input {
ControllerComponent controller;
StatsComponent stats;
Entity player;
	
	public Input() {
		
	}
	
	public Input(Entity player) {
		this.player = player;
		this.controller = Mappers.cm.get(player);
		this.stats = Mappers.sm.get(player);
	}
	
	public void setPlayer(Entity player) 	{
		this.player = player;
		this.controller = Mappers.cm.get(player);
		this.stats = Mappers.sm.get(player);
	}
	
	public void update(float delta) {
		if (Gdx.input.isKeyPressed(Keys.A)) {
			controller.rotate = stats.turnSpeed;
		} else if (Gdx.input.isKeyPressed(Keys.D)) {
			controller.rotate = -stats.turnSpeed;
		} else {
			controller.rotate = 0;
		}
		
		if (Gdx.input.isKeyPressed(Keys.W)) {
			controller.thrust = stats.power;
		} else {
			controller.thrust = 0;
		}
		
		if (Gdx.input.isKeyPressed(Keys.SPACE)) {
			controller.fire = true;
		} else {
			controller.fire = false;
		}
		
	}
	
}
