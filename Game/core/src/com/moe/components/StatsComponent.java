package com.moe.components;

import com.badlogic.ashley.core.Component;

/*
 * Stats Component
 * 
 * Gives entity stats that other components/systems can use to determine the entities health/power/speed/etc
 */

public class StatsComponent extends Component {
 
	public float power = 125.0f;
	public float turnSpeed = 4.0f;
	public float maxVel = 1000.0f;
	public int health = 100;
	
}
