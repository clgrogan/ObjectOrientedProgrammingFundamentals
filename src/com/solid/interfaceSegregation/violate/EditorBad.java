/**
 * 
 */
package com.solid.interfaceSegregation.violate;

/**
 * @author cgrogan
 *
 */
public class EditorBad implements Person {

	@Override
	public void readBook() {
		// Implement Book Reading Behavior

	}

	@Override
	public void editBook() {
		// Implement Book Editing Behavior

	}

	@Override
	public void createBook() {
		// Unnecessary at best

	}

}
