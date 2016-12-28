package com.xiaonei.mirage.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTechschool entity provides the base persistence definition of the
 * Techschool entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTechschool implements java.io.Serializable {

	// Fields

	private Integer id;
	private Town town;
	private City city;
	private String name;
	private Set userses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTechschool() {
	}

	/** minimal constructor */
	public AbstractTechschool(String name) {
		this.name = name;
	}

	/** full constructor */
	public AbstractTechschool(Town town, City city, String name, Set userses) {
		this.town = town;
		this.city = city;
		this.name = name;
		this.userses = userses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Town getTown() {
		return this.town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

}