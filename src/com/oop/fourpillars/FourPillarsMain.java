/**
 * 
 */
package com.oop.fourpillars;

import com.oop.fourpillars.abstraction.Abstraction;
import com.oop.fourpillars.encapsulation.Encapsulation;
import com.oop.fourpillars.inheritance.Inheritance;
import com.oop.fourpillars.polymorphism.Polymorphism;

/**
 * @author cgrogan
 *
 */
public class FourPillarsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		encapsulation();
		abstraction();
		polymorphism();
		inheritance();
		

	}


	/**
	 * Method uses the Encapsulation class which demonstrates encapsulation.
	 */
	private static void encapsulation() {
		Encapsulation capsule = new Encapsulation();

		/**
		 * Utilize the mutator or setter methods of the class to set the state
		 */
		capsule.setDefinition(
				"Encapsulation is one of the fundamentals of OOP (object-oriented programming). "
				+ "\n\tIt refers to the bundling of data with the methods that operate on that data.");
		capsule.setPurpose(
				"Encapsulation is used to hide the values or "
				+ "state of a structured data \n\tobject inside a class, preventing "
				+ "unauthorized parties' direct access to them.");
		capsule.setReference(
				"Programming Fundamentals by Dave Braunschweig. "
				+ "https://press.rebus.community/programmingfundamentals/chapter/encapsulation/");
		
		/**
		 * Utilize the accessor or getter methods of the class to get the state
		 */
		System.out.println("\nDefinition of \"Encapsulation\":");
		System.out.println("\t" + capsule.getDefinition());

		System.out.println("\nPurpose of \"Encapsulation\":");
		System.out.println("\t" + capsule.getPurpose());

		System.out.println("\nReference:");
		System.out.println("\t" + capsule.getReference());
	}

	/**
	 * Method uses the Abstraction class which demonstrates abstraction.
	 */
	private static void abstraction() {
		Abstraction abstraction = new Abstraction();
		
		abstraction.setPillar("Abstraction");
		abstraction.setDefinition(
				"In Object-oriented programming, abstraction is a process of hiding the "
				+ "\n\timplementation details from the user, only the functionality will be provided to the user. "
				+ "\n\tIn other words, the user will have the information on what the object does instead of how it does it.");
		abstraction.setPurpose("Simplify the understanding and use of a class.");
		abstraction.setReference("Tutorials Point. https://www.tutorialspoint.com/java/java_abstraction.htm");
		
		System.out.println(abstraction.toString());
		System.out.println(abstraction.demonstratePillar());
	}

	/**
	 * Method uses the Polymorphism class which demonstrates polymorphism.
	 */
	private static void polymorphism() {
		Polymorphism polymorph = new Polymorphism();
		
		polymorph.setPillar("Polymorphism");
		polymorph.setDefinition("Object-oriented programming (OOP) concept that refers to the "
				+ "ability of a variable, function or object to take on multiple forms");
		polymorph.setPurpose("A OOP language that features polymorphism allows developers to "
				+ "program in the general rather than program in the specific.");
		polymorph.setReference("Techopedia. https://www.techopedia.com/definition/28106/polymorphism-general-programming");

		System.out.println(polymorph.toString());
		System.out.println(polymorph.demonstratePillar());
		System.out.println(polymorph.demonstratePillar("Polymorphism"));
	}

	/**
	 * Method uses the Inheritance class which demonstrates inheritance.
	 */
	private static void inheritance() {
		Inheritance inherent = new Inheritance();
		
		inherent.setPillar("Inheritance");
		inherent.setDefinition("Inheritance is a mechanism where you can to derive a class "
				+ "\n\tfrom another class for a hierarchy of classes that share a set of attributes and methods.[1]");
		inherent.setPurpose("Inheritance allows programmers to create classes that are built upon existing classes,"
				+ "\n\tto specify a new implementation while maintaining the same behaviors "
				+ "\n\t(realizing an interface), to reuse code and to independently extend original "
				+ "\n\tsoftware via public classes and interfaces.[2]");
		inherent.setReference("[1]Stackify. https://stackify.com/oop-concept-inheritance/"
							+ "\n\t[2]Wikipedia. https://en.wikipedia.org/wiki/Inheritance_(object-oriented_programming)");
		System.out.println(inherent.toString());
		System.out.println(inherent.demonstratePillar());
	}
	

}
