package com.xiaonei.mirage.domain;

/**
 * Useruniversity entity. @author MyEclipse Persistence Tools
 */
public class Useruniversity extends AbstractUseruniversity implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Useruniversity() {
	}

	/** full constructor */
	public Useruniversity(University university, Users users, Integer uniYear,
			String userType, String college, String drom) {
		super(university, users, uniYear, userType, college, drom);
	}

}
