package com.xiaonei.mirage.domain;

import java.util.Set;

/**
 * Primaryschool entity. @author MyEclipse Persistence Tools
 */
public class Primaryschool extends AbstractPrimaryschool implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Primaryschool() {
	}

	/** minimal constructor */
	public Primaryschool(String name) {
		super(name);
	}

	/** full constructor */
	public Primaryschool(Town town, City city, String name, Set userses) {
		super(town, city, name, userses);
	}

}
