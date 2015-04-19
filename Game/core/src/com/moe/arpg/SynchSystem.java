package com.moe.arpg;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Array;

public class SynchSystem extends EntitySystem {
	World world;
	OrthographicCamera camera;
	public static Box2DDebugRenderer debugRenderer = new Box2DDebugRenderer();
	Array<Body> bodies = new Array<Body>();
	private Array<Entity> ents = new Array<Entity>();
	private BodyComponent cBody;
	private RenderComponent cRender;
	
	public SynchSystem(World world, OrthographicCamera camera) {
		this.world = world;
		this.camera = camera;
	}
	
	public void addEntity(Entity ent) {
		ents.add(ent);
	}
	
	public void update(float delta) {
		world.step(Gdx.graphics.getDeltaTime(), 6, 2);
			
		

		for (Entity e : ents) {
			if (Mappers.bm.get(e) != null) {
				Mappers.rm.get(e).sprite.setCenterX(Mappers.bm.get(e).body.getPosition().x);
				Mappers.rm.get(e).sprite.setCenterY(Mappers.bm.get(e).body.getPosition().y);
				Mappers.rm.get(e).sprite.setRotation(MathUtils.radiansToDegrees * Mappers.bm.get(e).body.getAngle());
			} else {
				Mappers.rm.get(e).sprite.setCenterX(0);
				Mappers.rm.get(e).sprite.setCenterY(0);
				Mappers.rm.get(e).sprite.setRotation(0);
			}
		}
		
	}

}
