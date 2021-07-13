/**
 * 
 */
package com.oop.fourpillars;

/**
 * @author cgrogan
 *
 */
public abstract class Pillar {
	
	/**
	 *  Private fields declared only accessible via methods
	 */
	private String pillar;
	private String definition;
	private String purpose;
	private String reference;
	
	/**
	 * Abstract method which should be used to demonstrate this.pilar
	 * @return
	 */
	public abstract String demonstratePillar();
	
	/**
	 * @return the pillar
	 */
	public String getPillar() {
		return pillar;
	}
	/**
	 * @param pillar the pillar to set
	 */
	public void setPillar(String pilar) {
		this.pillar = pilar;
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
		return "\n\n" + pillar 
				+ "\n\nDefinition of \""+ pillar + "\":"+ "\n\t" + definition
				+ "\n\nPurpose of \""+ pillar + "\":"+ "\n\t" + purpose 
				+ "\n\nReference for \""+ pillar + "\":"+ "\n\t" + reference
				;
	}
	
}
