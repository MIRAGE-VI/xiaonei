package com.xiaonei.mirage.domain;

import java.util.Set;

/**
 * Province entity. @author MyEclipse Persistence Tools
 */
public class Province extends AbstractProvince implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Province() {
	}

	/** minimal constructor */
	public Province(String name) {
		super(name);
	}

	/** full constructor */
	public Province(Country country, String name, Set universities,
			Set userses, Set cities) {
		super(country, name, universities, userses, cities);
	}

}
