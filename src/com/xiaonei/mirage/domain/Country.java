package com.xiaonei.mirage.domain;

import java.util.Set;

/**
 * Country entity. @author MyEclipse Persistence Tools
 */
public class Country extends AbstractCountry implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Country() {
	}

	/** minimal constructor */
	public Country(String name) {
		super(name);
	}

	/** full constructor */
	public Country(String name, Set provinces, Set universities) {
		super(name, provinces, universities);
	}

}
