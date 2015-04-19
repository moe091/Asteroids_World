package com.moe.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.Texture;

public class WeaponComponent extends Component {

	
	public WeaponComponent() {
		
	}
	
	public WeaponComponent setVel(float vel) {
		this.vel = vel;
		return this;
	}
	
	public WeaponComponent setDmg(float dmg) {
		this.dmg = dmg;
		return this;
	}
	
	public WeaponComponent setTexture(Texture texture) {
		this.img = texture;
		return this;
	}
	
	public WeaponComponent setCooldown(long cd) {
		this.cooldown = cd;
		return this;
	}
	
	
	
	
	public float vel = 100f;
	public float dmg = 5f;
	public Texture img;
	public long cooldown = 100;
	public long cooldownEnd = 0;
	
}
