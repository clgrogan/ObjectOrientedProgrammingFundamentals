/**
 * 
 */
package com.solid.liskovSubstitution;

/**
 * @author cgrogan
 *
 */
public class ElectricCar implements Car {

	@Override
	public void turnOnEngine() {
		throw new AssertionError("Electric cars don't have engines. Thus can't implement the behavior");

	}

	@Override
	public void accelerate() {
		throw new AssertionError("Can't implement the implied behavior without an Engine.");

	}

}
