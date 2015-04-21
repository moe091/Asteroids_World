package com.moe.components;

import com.badlogic.ashley.core.Component;

/*
 * Controller Component
 * 
 * Gives entity the ability to control itself and perform actions
 */

public class ControllerComponent extends Component {

	public float thrust = 0.0f;
	public float rotate = 0.0f;
	public boolean fire = false;
	public boolean active1 = false;
	public boolean active2 = false;
	public boolean active3 = false;
	public boolean active4 = false;
	public boolean special = false;
}
