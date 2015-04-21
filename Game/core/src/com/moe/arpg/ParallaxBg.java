package com.moe.arpg;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;

public class ParallaxBg {
	
	Sprite[][] sprites;
	Sprite follow;
	public ParallaxBg(Sprite base, Sprite follow) {
		sprites = new Sprite[5][5];

		this.follow = follow;
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				sprites[x][y] = new Sprite(base);
				sprites[x][y].setSize(100, 100);
				sprites[x][y].setPosition((x - 2) * 100, (y - 2) * 100);
			}
		}

		
	}
	
	public void update() {
		
		if (sprites[0][0].getX() > follow.getX()) { //ship is almost to left of leftmost sprite
			for (int x = 0; x < 5; x++) {
				for (int y = 0; y < 5; y++) {
					sprites[x][y].setX(sprites[x][y].getX() - 250);
					System.out.println("UPDATE!");
				}
			}
		}
		
		if (sprites[4][0].getX() < follow.getX()) { //ship is almost to left of leftmost sprite
			for (int x = 0; x < 5; x++) {
				for (int y = 0; y < 5; y++) {
					sprites[x][y].setX(sprites[x][y].getX() + 250);
					System.out.println("UPDATE!");
				}
			}
		}
		
		
		if (sprites[0][0].getY() > follow.getY()) { //ship is almost to left of leftmost sprite
			for (int x = 0; x < 5; x++) {
				for (int y = 0; y < 5; y++) {
					sprites[x][y].setY(sprites[x][y].getY() - 250);
					System.out.println("UPDATE!");
				}
			}
		}
		
		if (sprites[0][4].getY() < follow.getY()) { //ship is almost to left of leftmost sprite
			for (int x = 0; x < 5; x++) {
				for (int y = 0; y < 5; y++) {
					sprites[x][y].setY(sprites[x][y].getY() + 250);
					System.out.println("UPDATE!");
				}
			}
		}
		
		
		
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				
			}
		}
		
	}
	
	public void render(SpriteBatch batch) {
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				sprites[x][y].draw(batch);
			}
		}
	}

}