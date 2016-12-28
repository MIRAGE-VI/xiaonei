package com.xiaonei.mirage.domain;

/**
 * Usernet entity. @author MyEclipse Persistence Tools
 */
public class Usernet extends AbstractUsernet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Usernet() {
	}

	/** minimal constructor */
	public Usernet(String name) {
		super(name);
	}

	/** full constructor */
	public Usernet(Users users, String name, Short isPrimary) {
		super(users, name, isPrimary);
	}

}
