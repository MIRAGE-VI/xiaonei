package com.xiaonei.mirage.domain;

import java.util.Set;

/**
 * Town entity. @author MyEclipse Persistence Tools
 */
public class Town extends AbstractTown implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Town() {
	}

	/** minimal constructor */
	public Town(String name) {
		super(name);
	}

	/** full constructor */
	public Town(City city, String name, Set primaryschools, Set techschools,
			Set juniors, Set seniors) {
		super(city, name, primaryschools, techschools, juniors, seniors);
	}

}
