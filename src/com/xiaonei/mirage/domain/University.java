package com.xiaonei.mirage.domain;

import java.util.Set;

/**
 * University entity. @author MyEclipse Persistence Tools
 */
public class University extends AbstractUniversity implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public University() {
	}

	/** minimal constructor */
	public University(String name) {
		super(name);
	}

	/** full constructor */
	public University(Country country, Province province, String name,
			Set useruniversities) {
		super(country, province, name, useruniversities);
	}

}
