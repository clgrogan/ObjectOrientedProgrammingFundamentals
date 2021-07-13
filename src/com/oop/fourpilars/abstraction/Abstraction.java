/**
 * 
 */
package com.oop.fourpilars.abstraction;

import com.oop.fourpilars.Pilar;

/**
 * @author cgrogan
 *
 */
public class Abstraction extends Pilar {

	@Override
	public String demonstratePilar() {
		String nameOfMethod = new Throwable().getStackTrace()[0].getMethodName();
		String[] words = new String[] { "Method: ", nameOfMethod + "()", "\n\t", "This", "implementation", "demonstrates",
				"abstraction.", "It", "hides", "the", "complexity", "of", "the", "behavior", "\n\t", "and", "it", "provides",
				"the", "functionality", "of", "returning", "a", "String.", "\n\t", "Additionally,", "this", "is", "an",
				"implementation", "of", "an", "abstract", "method." };
		;
		return arrayToString(words);
	}

	/**
	 * 
	 * @param words
	 */
	private String arrayToString(String[] strArray) {
		String result = "";
		if (strArray.length > 0) {
			StringBuilder sb = new StringBuilder();
			for (String s : strArray) {
				sb.append(s).append(" ");
			}
			result = sb.deleteCharAt(sb.length() - 1).toString();
		}
		return result;

	}

}
