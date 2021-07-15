package com.solid;

import com.solid.dependencyInversion.BookClient;
import com.solid.openClose.PrincipleExtended;
import com.solid.singleResponsibility.Principle;
import com.solid.singleResponsibility.Print;

/**
 * @author cgrogan
 *
 */
public class SolidMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		singleResponsibility();
		openClosed();
		liskovSubstitution();
		interfaceSegregation();
		dependencyInversion();

	}

	private static void singleResponsibility() {
		Principle principle = new Principle();

		principle.setTitle("Single Responsibility Principle (SRP)");
		principle.setText("\n\tA class should only have one responsibility. Furthermore, it should only have one reason to change."
				+ "\n\tHow it helps:\n"
				+ "\t\t1. Testing - A class with one responsibility will have far fewer test cases.\n"
				+ "\t\t2. Lower coupling - Less functionality in a single class will have fewer dependencies.\n"
				+ "\t\t3. Organization - Smaller, well-organized classes are easier to search than monolithic ones.\n");
		principle.setReference(
				"Reference:\n\t"
				+ "A Solid Guide to SOLID Principles"
				+ "\n\thttps://www.baeldung.com/solid-principles");
		
		Print.p(" =".repeat(50));
		Print.p(principle.getTitle());
		Print.p(principle.getText());
		Print.p(principle.getReference());
		Print.p(" -".repeat(50));
	}

	private static void openClosed() {
		PrincipleExtended principle = new PrincipleExtended();

		principle.setTitle("Open-Closed Principle (OCP)");
		principle.setText("\n\tA class should be open for extension but closed for modification."
				+ "\n\tHow it helps:\n"
				+ "\t\t1. Avoid Bugs - Avoid modifying existing code and causing potential new bugs.\n"
				+ "\t\t\t Example: Here we extended Principle and added a property to the child class w/o changing Principle.\n"
				+ "\t\t2. Exception - When fixing bugs in existing code it is OK to modify the code.\n");
		principle.setReference(
				"Reference:\n\t"
				+ "A Solid Guide to SOLID Principles");
		principle.setRefUrl("\thttps://www.baeldung.com/solid-principles");
		
		Print.p(" =".repeat(50));
		Print.p(principle.getTitle());
		Print.p(principle.getText());
		Print.p(principle.getReference());
		Print.p(principle.getRefUrl());
		Print.p(" -".repeat(50));
		
	}

	private static void liskovSubstitution() {
		PrincipleExtended principle = new PrincipleExtended();

		principle.setTitle("Liskov Substitution Principle (LSP)");
		principle.setText("\n\tThe Liskov Substitution Principle (LSP) applies to inheritance hierarchies, specifying that you should"
				+ "\n\tdesign your classes so that client dependencies can be substituted with subclasses"
				+ "\n\twithout the client knowing about the change."
				+ "\n\tHow it helps:\n"
				+ "\t\t1. Avoid undefined behavior - Compliance ensures that the children behave as implied/expected by the parent.\n"
				+ "\t\t2. Reduces Unintended Side Effects or Bugs - Troubleshooting the type of bugs caused by undefined behavior "
				+ "\n\t\t\tcan be difficult and time consuming.\n");
		principle.setReference(
				"Reference:\n\t"
				+ "A Solid Guide to SOLID Principles");
		principle.setRefUrl("\thttps://www.baeldung.com/solid-principles");
		
		Print.p(" =".repeat(50));
		Print.p(principle.getTitle());
		Print.p(principle.getText());
		Print.p(principle.getReference());
		Print.p(principle.getRefUrl());
		Print.p(" -".repeat(50));
		
	}
	
	private static void interfaceSegregation() {
		PrincipleExtended principle = new PrincipleExtended();
		
		principle.setTitle("Interface Segregation Principle (ISP)");
		principle.setText("\n\tLarger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only "
				+ "\n\tneed to be concerned about the methods that are of interest to them."
				+ "\n\tHow it helps:\n"
				+ "\t\t1. Avoid bloated interfaces - Reduces Interfaces and ultimately classes having multiple responsibilities.\n"
				+ "\t\t2. Easier Maintenance & Testing - Easier to separate behavior and identify the root of the functionality or issue.\n"
				+ "\t\t3. Similar to and Helps comply with SRP.");
		principle.setReference(
				"Reference:\n\t"
				+ "A Solid Guide to SOLID Principles");
		principle.setRefUrl("\thttps://www.baeldung.com/solid-principles");
		
		Print.p(" =".repeat(50));
		Print.p(principle.getTitle());
		Print.p(principle.getText());
		Print.p(principle.getReference());
		Print.p(principle.getRefUrl());
		Print.p(" -".repeat(50));
	}
	
	private static void dependencyInversion() {
		PrincipleExtended principle = new PrincipleExtended();
		
		principle.setTitle("Dependency Inversion Principle (DIP)");
		principle.setText("\n\tDIP States That:"
				+ "\n\t\s 1. High level modules should not depend on low level modules; both should depend on abstractions."
				+ "\n\t\s 2. Abstractions should not depend on details. Details should depend upon abstraction."
				+ "\n\n\tHow it helps:"
				+ "\n\t\t1. Reduced Dependencies."
				+ "\n\t\t2. Reduced Dependency Carrying"
				+ "\n\t\t3. More Reusable Code."
				+ "\n\t\t4. More Testable Code."
				+ "\n\t\t5. More Readable Code.");
		principle.setReference(
				"\nReference:\n\t"
				+ "Understanding about SOLID - Dependency Inversion Principle, by Manh Phan");
		principle.setRefUrl("\thttps://ducmanhphan.github.io/2020-01-15-Understanding-about-SOLID-part-5/");
		
		Print.p(" =".repeat(50));
		Print.p(principle.getTitle());
		Print.p(principle.getText());
		
		/**
		 * Calling the client methods which will demonstrate and articulate
		 * the Principle
		 */

		Print.p(BookClient.violateRule());
		Print.p(BookClient.followRule());
		

		Print.p(principle.getReference());
		Print.p(principle.getRefUrl());
		
		Print.p(" -".repeat(50));
	}

}
