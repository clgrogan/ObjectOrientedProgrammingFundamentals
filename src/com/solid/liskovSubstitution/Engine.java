/**
 * 
 */
package com.solid.liskovSubstitution;

/**
 * @author cgrogan
 *
 */
public class Engine {
	
	private boolean on;
	private int power;
	
	/**
	 * @return the on
	 */
	public boolean isOn() {
		return on;
	}
	/**
	 * Set Engine on property to true
	 */
	public void startEngine() {
		this.on = true;
	}
	/**
	 * Set Engine on property to true
	 */
	public void turnOffEngine() {
		this.on = false;
	}
	/**
	 * @return the power
	 */
	public int getPower() {
		return power;
	}
	/**
	 * @param power the power to set
	 */
	public void setPower(int power) {
		this.power = power;
	}

}
