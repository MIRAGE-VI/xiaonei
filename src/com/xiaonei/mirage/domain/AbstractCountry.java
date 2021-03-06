package com.xiaonei.mirage.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCountry entity provides the base persistence definition of the
 * Country entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCountry implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set provinces = new HashSet(0);
	private Set universities = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCountry() {
	}

	/** minimal constructor */
	public AbstractCountry(String name) {
		this.name = name;
	}

	/** full constructor */
	public AbstractCountry(String name, Set provinces, Set universities) {
		this.name = name;
		this.provinces = provinces;
		this.universities = universities;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getProvinces() {
		return this.provinces;
	}

	public void setProvinces(Set provinces) {
		this.provinces = provinces;
	}

	public Set getUniversities() {
		return this.universities;
	}

	public void setUniversities(Set universities) {
		this.universities = universities;
	}

}