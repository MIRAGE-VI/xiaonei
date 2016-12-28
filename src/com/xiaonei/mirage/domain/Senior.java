package com.xiaonei.mirage.domain;

import java.util.Set;

/**
 * Senior entity. @author MyEclipse Persistence Tools
 */
public class Senior extends AbstractSenior implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Senior() {
	}

	/** minimal constructor */
	public Senior(String name) {
		super(name);
	}

	/** full constructor */
	public Senior(Town town, City city, String name, Set userseniors) {
		super(town, city, name, userseniors);
	}

}
