package com.solid.openClose;

import com.solid.singleResponsibility.Principle;

/**
 * @author cgrogan
 *
 */
public class PrincipleExtended extends Principle{
	
	private String refUrl;

	/**
	 * @param refUrl
	 */
	public PrincipleExtended(String refUrl) {
		super();
		this.refUrl = refUrl;
	}

	public PrincipleExtended() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the refUrl
	 */
	public String getRefUrl() {
		return refUrl;
	}

	/**
	 * @param refUrl the refUrl to set
	 */
	public void setRefUrl(String refUrl) {
		this.refUrl = refUrl;
	}
	
	

}
