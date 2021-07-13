/**
 * 
 */
package com.oop.fourpillars.inheritance;

import com.oop.fourpillars.Pillar;

/**
 * @author cgrogan
 *
 */
public class Inheritance extends Pillar {

	@Override
	public String demonstratePillar() {
		return "Example: Three of the four pillars classes are subclasses of the superclass Pillar,"
				+ "\n\tincluding this class (Inheritance). Many of the superclass's methods have the exact"
				+ "\n\tsame behavior in each of the subclasses. Using inheretence allows the reuse of the code."
				+ "\n\tSome behavior is different, and the subclasses override or overload methods accordingly."
				+ "\n\tChanges made to the super or parent class are reflected in the child classes. In contrast,"
				+ "\n\tthe Encapsulation class does not inheret from the Pillar class. It has some methods with similar"
				+ "\n\tbehavior as the other classes such as the getters and setters. That requires duplication of code."
				+ "\n\tHowever, the Encapsulation class lacks other methods such as the \"toString()\" and \"demonstratePillar()\" methods."
				;
	}

}
