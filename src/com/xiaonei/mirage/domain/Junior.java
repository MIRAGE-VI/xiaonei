package com.xiaonei.mirage.domain;

import java.util.Set;

/**
 * Junior entity. @author MyEclipse Persistence Tools
 */
public class Junior extends AbstractJunior implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Junior() {
	}

	/** minimal constructor */
	public Junior(String name) {
		super(name);
	}

	/** full constructor */
	public Junior(Town town, City city, String name, Set userses) {
		super(town, city, name, userses);
	}

}
