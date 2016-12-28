package com.xiaonei.mirage.domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */
public class Users extends AbstractUsers implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String email, String name, String pwd) {
		super(email, name, pwd);
	}

	/** full constructor */
	public Users(Techschool techschool, Junior junior, Province province,
			City city, Primaryschool primaryschool, String email, String name,
			String pwd, String photo, String sex, Date birth, String tel,
			String mobile, String oicq, String msn, String website,
			Integer techSchYear, Integer juniorYear, Integer primaryYear,
			String interest, String music, String movie, String game,
			String cartoon, String sport, String book, String assn,
			Integer visited, String doing, Short online,
			Timestamp registerDate, Timestamp loginDate, Short level,
			Short locked, Set userseniors, Set useruniversities, Set usernets) {
		super(techschool, junior, province, city, primaryschool, email, name,
				pwd, photo, sex, birth, tel, mobile, oicq, msn, website,
				techSchYear, juniorYear, primaryYear, interest, music, movie,
				game, cartoon, sport, book, assn, visited, doing, online,
				registerDate, loginDate, level, locked, userseniors,
				useruniversities, usernets);
	}

}
