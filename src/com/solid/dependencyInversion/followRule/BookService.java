package com.solid.dependencyInversion.followRule;

import com.solid.dependencyInversion.Book;

public class BookService {
	
	public Book createBook(String title, NumberGenerator numberGenerator) {
		return new Book(title, numberGenerator.generateNumber());
	}

}
