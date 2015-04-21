package com.moe.arpg;

import com.badlogic.ashley.core.ComponentMapper;
import com.moe.components.BodyComponent;
import com.moe.components.ControllerComponent;
import com.moe.components.RenderComponent;
import com.moe.components.StatsComponent;
import com.moe.components.WeaponComponent;

public class Mappers {

	public static ComponentMapper<RenderComponent> rm = ComponentMapper.getFor(RenderComponent.class);
	public static ComponentMapper<BodyComponent> bm = ComponentMapper.getFor(BodyComponent.class);
	public static ComponentMapper<ControllerComponent> cm = ComponentMapper.getFor(ControllerComponent.class);
	public static ComponentMapper<StatsComponent> sm = ComponentMapper.getFor(StatsComponent.class); 
	public static ComponentMapper<WeaponComponent> wm = ComponentMapper.getFor(WeaponComponent.class);
	
}

