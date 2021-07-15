/**
 * 
 */
package com.solid.interfaceSegregation.violate;

/**
 * @author cgrogan
 *
 */
public class ReaderBad implements Person {

	@Override
	public void readBook() {
		// Implement book reading behavior

	}

	@Override
	public void createBook() {
		// Unnecessary at best

	}

	@Override
	public void editBook() {
		// Unnecessary at best
	}

}
