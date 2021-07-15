package com.solid.dependencyInversion.violate;

import com.solid.dependencyInversion.Book;

public class BookServiceV {
	private IsbnGeneratorV isbn = new IsbnGeneratorV();
	
	public Book createBook(String title) {
		return new Book(title, isbn.generateNumber());
	}

}
