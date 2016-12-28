package com.xiaonei.mirage.domain;

/**
 * AbstractUsernet entity provides the base persistence definition of the
 * Usernet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsernet implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private String name;
	private Short isPrimary;

	// Constructors

	/** default constructor */
	public AbstractUsernet() {
	}

	/** minimal constructor */
	public AbstractUsernet(String name) {
		this.name = name;
	}

	/** full constructor */
	public AbstractUsernet(Users users, String name, Short isPrimary) {
		this.users = users;
		this.name = name;
		this.isPrimary = isPrimary;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getIsPrimary() {
		return this.isPrimary;
	}

	public void setIsPrimary(Short isPrimary) {
		this.isPrimary = isPrimary;
	}

}