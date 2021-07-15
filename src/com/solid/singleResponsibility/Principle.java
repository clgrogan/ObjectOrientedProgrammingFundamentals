/**
 * 
 */
package com.solid.singleResponsibility;

/**
 * @author cgrogan
 *
 */
public class Principle {

    private String title;
    private String text;
    private String reference;
    
	/**
	 * Constructors, getters, and setters are appropriate
	 */
    
	/*
	 * Methods directly related to the class properties are appropriate
	 */
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
    
	/**
	 * Should NOT contain a method to output the text to the console, etc.
	 */
//    public void printTextToConsole() {
//    	System.out.println(this.text);
//    }
    
    
	public Principle() {
		super();
	}
	
	/**
	 * @param title
	 * @param text
	 * @param reference
	 */
	public Principle(String title, String text, String reference) {
		super();
		this.title = title;
		this.text = text;
		this.reference = reference;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
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
