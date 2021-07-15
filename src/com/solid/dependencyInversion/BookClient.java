package com.solid.dependencyInversion;

import com.solid.dependencyInversion.followRule.BookService;
import com.solid.dependencyInversion.followRule.IsbnGenerator;
import com.solid.dependencyInversion.followRule.IssnGenerator;
import com.solid.dependencyInversion.violate.BookServiceV;

public abstract class BookClient {
	


//	public static void main(String[] args) {
//		System.out.println(violateRule());
//		System.out.println(followRule());
//
//	}
	
	public static String violateRule() {
		String returnString = "\n\nExample:\s NOT following DIP:";
		Book isbnOnlyBook = new BookServiceV().createBook("Book Must Have ISBN. Can't Have ISSN");
		
		returnString += "\n\s\sThe BookServiceV class depends on the IsbnGenerator class so is tightly coupled\n"
				+ "\tTo use a different number generator would require modifying the code.\n"
				+ "\tSo this BookService will only return books with an ISBN number.";
		returnString += "\n\n\s\s\sBelow is the code used to create the book from the tightly coupled BookService:";
		returnString += "\n\tBook isbnOnlyBook = new BookServiceV().createBook(\"Book Must Have ISBN. Can't Have ISSN\");";
		returnString += "\n\t\sBook object attributes:";
		returnString += "\n\t\tisbnOnlyBook.getTitle(): " + isbnOnlyBook.getTitle();
		returnString += "\n\t\tisbnOnlyBook.getNumber(): " + isbnOnlyBook.getNumber();

		return returnString;
	}
	
	public static String followRule() {
		String returnString = "\n\nExample:\s\sUsing Dependency Inversion Principle";
		Book issnBook = new BookService().createBook("Will have ISBN, ISSN, or other # type based on the object type passed into the createBook method.", new IssnGenerator());
		Book isbnBook = new BookService().createBook("Will have ISBN, ISSN, or other # type based on the object type passed into the createBook method.", new IsbnGenerator());

		
		returnString += "\n\s\sThe BookService class has a method that accepts an object of type NumberGenerator."
				+ "\n\tNumberGenerator is an interface, so the object will be an implementation of the interface."
				+ "\n\t...the exact implementation isn't important. We have two classes that implement NumberGenerator"
				+ "\n\n\tClasses implementing NumberGenerator are IssnGenerator & IsbnGenerator.";
		returnString += "\n\nWe'll create two books using the BookService.createBook(String s, NumberGenerator ng) method."
				+ "\n\nThe only difference between the two books is the Type of the NumberGenerator object passed:";
		returnString += "\n\n\t"
				+ "Book issnBook = new BookService().createBook(\"Will have ISBN, ISSN, or other # type based on the object type passed into the createBook method.\"\n\t\t, new IssnGenerator());"
				+ "\n\t"
				+ "Book isbnBook = new BookService().createBook(\"Will have ISBN, ISSN, or other # type based on the object type passed into the createBook method.\"\n\t\t, new IsbnGenerator());";
		returnString += "\n\n\tBook objects' attributes:";
		returnString += "\n\t\sissnBook.getTitle(): " + issnBook.getTitle();
		returnString += "\n\t\sissnBook.getNumber(): " + issnBook.getNumber();
		returnString += "\n\t\sisbnBook.getTitle(): " + isbnBook.getTitle();
		returnString += "\n\t\sisbnBook.getNumber(): " + isbnBook.getNumber();
		return returnString;
	}

}
