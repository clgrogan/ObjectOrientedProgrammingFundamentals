package com.solid.interfaceSegregation;

/**
 * @author cgrogan
 *
 */
public class Author implements BookReader, BookCreator, BookEditor {

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
