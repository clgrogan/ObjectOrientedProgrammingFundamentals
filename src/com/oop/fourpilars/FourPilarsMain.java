/**
 * 
 */
package com.oop.fourpilars;

import com.oop.fourpilars.abstraction.Abstraction;
import com.oop.fourpilars.encapsulation.Encapsulation;
import com.oop.fourpilars.polymorphism.Polymorphism;

/**
 * @author cgrogan
 *
 */
public class FourPilarsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		encapsulation();
		abstraction();
		polymorphism();

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
		
		abstraction.setPilar("Abstraction");
		abstraction.setDefinition(
				"In Object-oriented programming, abstraction is a process of hiding the "
				+ "\n\timplementation details from the user, only the functionality will be provided to the user. "
				+ "\n\tIn other words, the user will have the information on what the object does instead of how it does it.");
		abstraction.setPurpose("Simplify the understanding and use of a class.");
		abstraction.setReference("Tutorials Point. https://www.tutorialspoint.com/java/java_abstraction.htm");
		
		System.out.println(abstraction.toString());
		System.out.println(abstraction.demonstratePilar());
	}

	/**
	 * Method uses the Polymorphism class which demonstrates polymorphism.
	 */
	private static void polymorphism() {
		Polymorphism polymorph = new Polymorphism();
		
		polymorph.setPilar("Polymorphism");
		polymorph.setDefinition("Object-oriented programming (OOP) concept that refers to the "
				+ "ability of a variable, function or object to take on multiple forms");
		polymorph.setPurpose("A OOP language that features polymorphism allows developers to "
				+ "program in the general rather than program in the specific.");
		polymorph.setReference("Techopedia. https://www.techopedia.com/definition/28106/polymorphism-general-programming");

		System.out.println(polymorph.toString());
		System.out.println(polymorph.demonstratePilar());
		System.out.println(polymorph.demonstratePilar("Polymorphism"));
		
	}
	

}
