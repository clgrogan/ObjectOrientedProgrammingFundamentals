package com.solid.interfaceSegregation;

/**
 * @author cgrogan
 *
 */
public class Editor implements BookReader, BookEditor {

	@Override
	public void readBook() {
		// Implement Book Reading Behavior

	}

	@Override
	public void editBook() {
		// Implement Book Editing Behavior

	}

}
