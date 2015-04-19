package Systems;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import com.moe.arpg.BodyComponent;
import com.moe.arpg.ControllerComponent;
import com.moe.arpg.GameManager;
import com.moe.arpg.Mappers;
import com.moe.arpg.RenderComponent;
import com.moe.components.WeaponComponent;

public class WeaponSystem extends EntitySystem {
Array<Entity> entities = new Array<Entity>();
ControllerComponent cController;
WeaponComponent cWeapon;
BodyComponent cBody;
World world;
GameManager manager;

	public WeaponSystem(World world, GameManager manager) {
		this.world = world;
		this.manager = manager;
	}
	public void addEntity(Entity e) {
		entities.add(e);
	}
	
	public void update(float delta) {
		
		for (Entity e : entities) {
			cController = Mappers.cm.get(e);
			if (cController != null) {
				cWeapon = Mappers.wm.get(e);
				cBody = Mappers.bm.get(e);
				if (cController.fire) {
					System.out.println("millis: " + TimeUtils.millis() + ",   cd end: " + cWeapon.cooldownEnd);
					if (TimeUtils.millis() > cWeapon.cooldownEnd) {
						fire();
					}
				}
				
			}
		}
		
	}
	
	public void fire() {
		System.out.println("Firing");
		Entity bullet = new Entity();
		bullet.add(new RenderComponent(cWeapon.img));
		bullet.add(new BodyComponent(world, Mappers.rm.get(bullet), cBody.body.getPosition().x + (float) Math.cos(cBody.body.getAngle()) * 5, cBody.body.getPosition().y + (float) Math.sin(cBody.body.getAngle()) * 5));
		
		manager.renderSys.addEntity(bullet);
		manager.synchSys.addEntity(bullet);
		Mappers.bm.get(bullet).body.applyForceToCenter(cWeapon.vel * (float) Math.cos(cBody.body.getAngle()), cWeapon.vel * (float) Math.sin(cBody.body.getAngle()), false);
		cWeapon.cooldownEnd = cWeapon.cooldown + TimeUtils.millis();
	}
	
	
}
