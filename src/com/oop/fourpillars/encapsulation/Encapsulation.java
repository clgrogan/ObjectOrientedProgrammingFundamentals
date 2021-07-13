package com.oop.fourpillars.encapsulation;

/**
 * Class used to demonstrate encapsulation
 * @author cgrogan
 *
 */
public class Encapsulation {
	
	/**
	 *  Private fields declared only accessible via methods
	 */
	private String definition;
	private String purpose;
	private String reference;
	
	
	/**
	 * @return the definition
	 */
	public String getDefinition() {
		return definition;
	}
	/**
	 * @param definition the definition to set
	 */
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	/**
	 * @return the purpose
	 */
	public String getPurpose() {
		return purpose;
	}
	/**
	 * @param purpose the purpose to set
	 */
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}
	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
}
