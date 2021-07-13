package com.oop.fourpilars.polymorphism;

import com.oop.fourpilars.Pilar;

public class Polymorphism extends Pilar {

	
	/**
	 * This method demonstrates Dynamic or Runtime Polymorphism
	 * using overriding.
	 */
	@Override
	public String demonstratePilar() {
		String overRiding = 
						"\n\nOverriding - Dynamic or Runtime Polymorphism."
						+ "\n\ta. The derived class implementation of a method of its superclass."
						+ "\n\tb. Can have the same interface."
						+ "\n Example: This implementation of the demonstratePilar() method "
						+ "\n\toverrides the superclass Pilar demonstratePilar() method. Thus the"
						+ "\n\tsuperclass method's behavior is replaced by the overriding behavior.";
		return overRiding;
	}

	
	/**
	 * This method demonstrates Static or Compile Time Polymorphism
	 * using overloading.
	 */
	public String demonstratePilar(String polyString) {
		String overLoading = 
						"\n\n" + polyString + " - Static or Compile Time Polymorphism"
						+ "\n\t Same method name behaves differently. The difference occurs"
						+ "\n\t because of a different interface or types of arguments passed"
						+ "\n\t while calling the method."
						+ "\n Example: This implementation of the demonstratePilar method accepts a String argument."
						+ "\n\tOverloading occurs with the new signature \"demonstratePilar(String s)\""
						+ "\n\tThis leaves the method with the signature \"demonstratePilar()\" unchanged. The overloading adds"
						+ "\n\tbehavior without changing the superclass method's behavior.";
		
		return overLoading;
	}

}
