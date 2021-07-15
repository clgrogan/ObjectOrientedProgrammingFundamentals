package com.solid.liskovSubstitution;

/**
 * @author cgrogan
 *
 */
public class CombustionCar implements Car{
	
	private Engine engine;

	/**
	 * Turns On the Cars Engine
	 */
	@Override
	public void turnOnEngine() {
		engine.startEngine();
	}

	@Override
	public void accelerate() {
		engine.setPower(50);		
	}
	
	

}
