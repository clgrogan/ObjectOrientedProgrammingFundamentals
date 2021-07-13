package com.oop.fourpillars.polymorphism;

import com.oop.fourpillars.Pillar;

public class Polymorphism extends Pillar {

	
	/**
	 * This method demonstrates Dynamic or Runtime Polymorphism
	 * using overriding.
	 */
	@Override
	public String demonstratePillar() {
		String overRiding = 
						"\n\nOverriding - Dynamic or Runtime Polymorphism."
						+ "\n\ta. The derived class implementation of a method of its superclass."
						+ "\n\tb. Can have the same interface."
						+ "\n Example: This implementation of the demonstratePillar() method "
						+ "\n\toverrides the superclass Pillar demonstratePillar() method. Thus the"
						+ "\n\tsuperclass method's behavior is replaced by the overriding behavior.";
		return overRiding;
	}

	
	/**
	 * This method demonstrates Static or Compile Time Polymorphism
	 * using overloading.
	 */
	public String demonstratePillar(String polyString) {
		String overLoading = 
						"\n\n" + polyString + " - Static or Compile Time Polymorphism"
						+ "\n\t Same method name behaves differently. The difference occurs"
						+ "\n\t because of a different interface or types of arguments passed"
						+ "\n\t while calling the method."
						+ "\n Example: This implementation of the demonstratePillar method accepts a String argument."
						+ "\n\tOverloading occurs with the new signature \"demonstratePillar(String s)\""
						+ "\n\tThis leaves the method with the signature \"demonstratePillar()\" unchanged. The overloading adds"
						+ "\n\tbehavior without changing the superclass method's behavior.";
		
		return overLoading;
	}

}
