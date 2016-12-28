package com.xiaonei.mirage.domain;

import java.util.Set;

/**
 * City entity. @author MyEclipse Persistence Tools
 */
public class City extends AbstractCity implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public City() {
	}

	/** minimal constructor */
	public City(String name) {
		super(name);
	}

	/** full constructor */
	public City(Province province, String name, Set towns, Set seniors,
			Set primaryschools, Set techschools, Set userses, Set juniors) {
		super(province, name, towns, seniors, primaryschools, techschools,
				userses, juniors);
	}

}
