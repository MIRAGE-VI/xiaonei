package com.xiaonei.mirage.domain;

/**
 * Usersenior entity. @author MyEclipse Persistence Tools
 */
public class Usersenior extends AbstractUsersenior implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Usersenior() {
	}

	/** full constructor */
	public Usersenior(Senior senior, Users users, Integer seniorYear,
			String grade1, String grade2, String grade3) {
		super(senior, users, seniorYear, grade1, grade2, grade3);
	}

}
