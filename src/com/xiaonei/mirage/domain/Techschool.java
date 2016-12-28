package com.xiaonei.mirage.domain;

import java.util.Set;

/**
 * Techschool entity. @author MyEclipse Persistence Tools
 */
public class Techschool extends AbstractTechschool implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Techschool() {
	}

	/** minimal constructor */
	public Techschool(String name) {
		super(name);
	}

	/** full constructor */
	public Techschool(Town town, City city, String name, Set userses) {
		super(town, city, name, userses);
	}

}
