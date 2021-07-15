/**
 * 
 */
package com.solid.interfaceSegregation.violate;

/**
 * @author cgrogan
 *
 */
public class AuthorBad implements Person {

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
		// Implement Book Creating Behavior

	}

}
