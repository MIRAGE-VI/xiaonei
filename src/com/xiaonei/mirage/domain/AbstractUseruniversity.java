package com.xiaonei.mirage.domain;

/**
 * AbstractUseruniversity entity provides the base persistence definition of the
 * Useruniversity entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUseruniversity implements java.io.Serializable {

	// Fields

	private Integer id;
	private University university;
	private Users users;
	private Integer uniYear;
	private String userType;
	private String college;
	private String drom;

	// Constructors

	/** default constructor */
	public AbstractUseruniversity() {
	}

	/** full constructor */
	public AbstractUseruniversity(University university, Users users,
			Integer uniYear, String userType, String college, String drom) {
		this.university = university;
		this.users = users;
		this.uniYear = uniYear;
		this.userType = userType;
		this.college = college;
		this.drom = drom;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Integer getUniYear() {
		return this.uniYear;
	}

	public void setUniYear(Integer uniYear) {
		this.uniYear = uniYear;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDrom() {
		return this.drom;
	}

	public void setDrom(String drom) {
		this.drom = drom;
	}

}