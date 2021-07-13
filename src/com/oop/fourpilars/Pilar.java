/**
 * 
 */
package com.oop.fourpilars;

/**
 * @author cgrogan
 *
 */
public abstract class Pilar {
	
	/**
	 *  Private fields declared only accessible via methods
	 */
	private String pilar;
	private String definition;
	private String purpose;
	private String reference;
	
	/**
	 * Abstract method which should be used to demonstrate this.pilar
	 * @return
	 */
	public abstract String demonstratePilar();
	
	/**
	 * @return the pilar
	 */
	public String getPilar() {
		return pilar;
	}
	/**
	 * @param pilar the pilar to set
	 */
	public void setPilar(String pilar) {
		this.pilar = pilar;
	}
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
	@Override
	public String toString() {
		return "\n" + pilar 
				+ "\n\nDefinition of \""+ pilar + "\":"+ "\n\t" + definition
				+ "\n\nPurpose of \""+ pilar + "\":"+ "\n\t" + purpose 
				+ "\n\nReference for \""+ pilar + "\":"+ "\n\t" + reference
				;
	}
	
}
